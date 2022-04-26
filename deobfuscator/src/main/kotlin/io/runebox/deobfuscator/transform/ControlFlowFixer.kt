package io.runebox.deobfuscator.transform

import io.runebox.asm.ClassPool
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.tree.AbstractInsnNode.*
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.LabelNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.tree.analysis.Analyzer
import org.objectweb.asm.tree.analysis.BasicInterpreter
import org.objectweb.asm.tree.analysis.BasicValue
import org.tinylog.kotlin.Logger
import java.util.*
import kotlin.collections.AbstractMap

class ControlFlowFixer : Transformer {

    private var count = 0

    override fun execute(pool: ClassPool) {
        pool.classes().forEach { cls ->
            cls.methods.forEach { method ->
                if(method.tryCatchBlocks.isEmpty()) {
                    val cfg = ControlFlowGraph(pool).also { it.analyze(cls.name, method) }
                    method.rebuildInsns(cfg)
                    count += cfg.blocks.size
                }
            }
        }

        Logger.info("Reordered $count control-flow blocks.")
    }

    private fun MethodNode.rebuildInsns(cfg: ControlFlowGraph) {
        val newInsns = InsnList()
        val origInsns = this.instructions

        if(cfg.blocks.isEmpty()) {
            this.instructions = newInsns
            return
        }

        val labelMap = LabelMap()
        val queue = Stack<ControlFlowBlock>()
        val visited = hashSetOf<ControlFlowBlock>()
        queue.push(cfg.blocks.first())

        while(queue.isNotEmpty()) {
            val block = queue.pop()
            if(block in visited) continue
            visited.add(block)
            block.branches.forEach { queue.push(it.head) }
            block.next?.also { queue.add(it) }
            for(i in block.start until block.end) {
                newInsns.add(origInsns[i].clone(labelMap))
            }
        }

        this.instructions = newInsns
    }

    private class ControlFlowGraph(private val pool: ClassPool) : Analyzer<BasicValue>(BasicInterpreter()) {

        val blocks = mutableListOf<ControlFlowBlock>()

        override fun init(owner: String, method: MethodNode) {
            val insns = method.instructions
            var block = ControlFlowBlock()
            blocks.add(block)
            for(i in 0 until insns.size()) {
                val insn = insns[i]
                block.end++
                if(insn.next == null) break
                if(insn.next.type == LABEL
                    || insn.type == JUMP_INSN
                    || insn.type == LOOKUPSWITCH_INSN
                    || insn.type == TABLESWITCH_INSN) {
                    block = ControlFlowBlock()
                    block.start = i + 1
                    block.end = i + 1
                    blocks.add(block)
                }
            }
        }

        override fun newControlFlowEdge(insnIndex: Int, successorIndex: Int) {
            val currentBlock = blocks.first { insnIndex in it.start until it.end }
            val nextBlock = blocks.first { successorIndex in it.start until it.end }
            if(currentBlock != nextBlock) {
                if(insnIndex + 1 == successorIndex) {
                    currentBlock.next = nextBlock
                    nextBlock.prev = currentBlock
                } else {
                    currentBlock.branches.add(nextBlock)
                }
            }
        }
    }

    private class ControlFlowBlock {
        var start = 0
        var end = 0

        var prev: ControlFlowBlock? = null
        var next: ControlFlowBlock? = null

        val branches = mutableListOf<ControlFlowBlock>()

        val head: ControlFlowBlock get() {
            var block = this
            var last = prev
            while(last != null) {
                block = last
                last = block.prev
            }
            return block
        }
    }

    private class LabelMap : AbstractMap<LabelNode, LabelNode>() {
        private val map = hashMapOf<LabelNode, LabelNode>()
        override val entries get() = throw IllegalStateException()
        override fun get(key: LabelNode) = map.getOrPut(key) { LabelNode() }
    }
}