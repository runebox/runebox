import java.util.Comparator;

final class class110 implements Comparator {
   int method805(class82 var1, class82 var2) {
      return var1.field1253.field1798 < var2.field1253.field1798 ? -1 : (var1.field1253.field1798 == var2.field1253.field1798 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method805((class82)var1, (class82)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
