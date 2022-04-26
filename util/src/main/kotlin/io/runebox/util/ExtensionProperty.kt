@file:Suppress("UNCHECKED_CAST")

package io.runebox.util

import java.util.*
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class SimpleProperty<R, T>(var value: T) : ReadWriteProperty<R, T> {
    override fun getValue(thisRef: R, property: KProperty<*>): T {
        return value
    }

    override fun setValue(thisRef: R, property: KProperty<*>, value: T) {
        this.value = value
    }
}

class ExtensionProperty<R, T>(val defaultValue: T?) : ReadWriteProperty<R, T> {
    internal val propertyMap = WeakHashMap<R, SimpleProperty<*, *>>()

    override fun getValue(thisRef: R, property: KProperty<*>): T {
        val prop = propertyMap[thisRef] as? SimpleProperty<R, T>
        return prop?.getValue(thisRef, property) ?: defaultValue ?: throw NullPointerException("Extension property value not set.")
    }

    override fun setValue(thisRef: R, property: KProperty<*>, value: T) {
        propertyMap.putIfAbsent(thisRef, SimpleProperty<R, T>(value))
    }
}

fun <R, T> property(defaultValue: T? = null) = ExtensionProperty<R, T>(defaultValue)