import java.util.Comparator;
import java.util.Map;

class class33 implements Comparator {
   static int field305;
   // $FF: synthetic field
   final class233 this$0;

   class33(class233 var1) {
      this.this$0 = var1;
   }

   int method145(Map.Entry var1, Map.Entry var2) {
      return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }

   public int compare(Object var1, Object var2) {
      return this.method145((Map.Entry)var1, (Map.Entry)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
