import java.util.Iterator;

public class class399 {
   public static class509 field2774;
   static Iterator field2776;
   int field2775;
   int field2778;
   int[][] field2777;

   public class399(int var1, int var2) {
      if (var2 != var1) {
         int var4 = var1;
         int var5 = var2;
         if (var2 > var1) {
            var4 = var2;
            var5 = var1;
         }

         while(var5 != 0) {
            int var6 = var4 % var5;
            var4 = var5;
            var5 = var6;
         }

         var1 /= var4;
         var2 /= var4;
         this.field2775 = var1;
         this.field2778 = var2;
         this.field2777 = new int[var1][14];

         for(int var7 = 0; var7 < var1; ++var7) {
            int[] var8 = this.field2777[var7];
            double var9 = 6.0 + (double)var7 / (double)var1;
            int var11 = (int)Math.floor(1.0 + (var9 - 7.0));
            if (var11 < 0) {
               var11 = 0;
            }

            int var12 = (int)Math.ceil(var9 + 7.0);
            if (var12 > 14) {
               var12 = 14;
            }

            for(double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
               double var15 = ((double)var11 - var9) * Math.PI;
               double var17 = var13;
               if (var15 < -1.0E-4 || var15 > 1.0E-4) {
                  var17 = var13 * (Math.sin(var15) / var15);
               }

               var17 *= 0.54 + 0.46 * Math.cos(0.2243994752564138 * ((double)var11 - var9));
               var8[var11] = (int)Math.floor(0.5 + var17 * 65536.0);
            }
         }

      }
   }

   byte[] method1821(byte[] var1) {
      if (null != this.field2777) {
         int var3 = (int)((long)this.field2778 * (long)var1.length / (long)this.field2775) + 14;
         int[] var4 = new int[var3];
         int var5 = 0;
         int var6 = 0;

         int var7;
         int var8;
         for(var7 = 0; var7 < var1.length; ++var7) {
            var8 = var1[var7];
            int[] var9 = this.field2777[var6];

            int var10;
            for(var10 = 0; var10 < 14; ++var10) {
               var4[var10 + var5] += var8 * var9[var10];
            }

            var6 += this.field2778;
            var10 = var6 / this.field2775;
            var5 += var10;
            var6 -= var10 * this.field2775;
         }

         var1 = new byte[var3];

         for(var7 = 0; var7 < var3; ++var7) {
            var8 = '\u8000' + var4[var7] >> 16;
            if (var8 < -128) {
               var1[var7] = -128;
            } else if (var8 > 127) {
               var1[var7] = 127;
            } else {
               var1[var7] = (byte)var8;
            }
         }
      }

      return var1;
   }

   int method1822(int var1) {
      if (null != this.field2777) {
         var1 = (int)((long)var1 * (long)this.field2778 / (long)this.field2775);
      }

      return var1;
   }

   int method1820(int var1) {
      if (this.field2777 != null) {
         var1 = 6 + (int)((long)var1 * (long)this.field2778 / (long)this.field2775);
      }

      return var1;
   }
}
