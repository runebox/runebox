public class class506 implements class307 {
   int field3968;
   int field3969;
   int field3970;

   public class196 method1670() {
      byte var2;
      if (class194.field1891.startsWith("win")) {
         var2 = 1;
      } else if (class194.field1891.startsWith("mac")) {
         var2 = 2;
      } else if (class194.field1891.startsWith("linux")) {
         var2 = 3;
      } else {
         var2 = 4;
      }

      String var3;
      try {
         var3 = System.getProperty("os.arch").toLowerCase();
      } catch (Exception var31) {
         var3 = "";
      }

      String var4;
      try {
         var4 = System.getProperty("os.version").toLowerCase();
      } catch (Exception var30) {
         var4 = "";
      }

      String var5 = "Unknown";
      String var6 = "1.1";

      try {
         var5 = System.getProperty("java.vendor");
         var6 = System.getProperty("java.version");
      } catch (Exception var29) {
      }

      boolean var7;
      if (!var3.startsWith("amd64") && !var3.startsWith("x86_64")) {
         var7 = false;
      } else {
         var7 = true;
      }

      byte var8 = 0;
      if (var2 == 1) {
         if (var4.indexOf("4.0") != -1) {
            var8 = 1;
         } else if (var4.indexOf("4.1") != -1) {
            var8 = 2;
         } else if (var4.indexOf("4.9") != -1) {
            var8 = 3;
         } else if (var4.indexOf("5.0") != -1) {
            var8 = 4;
         } else if (var4.indexOf("5.1") != -1) {
            var8 = 5;
         } else if (var4.indexOf("5.2") != -1) {
            var8 = 8;
         } else if (var4.indexOf("6.0") != -1) {
            var8 = 6;
         } else if (var4.indexOf("6.1") != -1) {
            var8 = 7;
         } else if (var4.indexOf("6.2") != -1) {
            var8 = 9;
         } else if (var4.indexOf("6.3") != -1) {
            var8 = 10;
         } else if (var4.indexOf("10.0") != -1) {
            var8 = 11;
         }
      } else if (var2 == 2) {
         if (var4.indexOf("10.4") != -1) {
            var8 = 20;
         } else if (var4.indexOf("10.5") != -1) {
            var8 = 21;
         } else if (var4.indexOf("10.6") != -1) {
            var8 = 22;
         } else if (var4.indexOf("10.7") != -1) {
            var8 = 23;
         } else if (var4.indexOf("10.8") != -1) {
            var8 = 24;
         } else if (var4.indexOf("10.9") != -1) {
            var8 = 25;
         } else if (var4.indexOf("10.10") != -1) {
            var8 = 26;
         } else if (var4.indexOf("10.11") != -1) {
            var8 = 27;
         } else if (var4.indexOf("10.12") != -1) {
            var8 = 28;
         } else if (var4.indexOf("10.13") != -1) {
            var8 = 29;
         }
      }

      byte var9;
      if (var5.toLowerCase().indexOf("sun") != -1) {
         var9 = 1;
      } else if (var5.toLowerCase().indexOf("microsoft") != -1) {
         var9 = 2;
      } else if (var5.toLowerCase().indexOf("apple") != -1) {
         var9 = 3;
      } else if (var5.toLowerCase().indexOf("oracle") != -1) {
         var9 = 5;
      } else {
         var9 = 4;
      }

      this.method2449(var6);
      boolean var10 = false;
      int var11 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
      int var12;
      if (this.field3969 > 3) {
         var12 = Runtime.getRuntime().availableProcessors();
      } else {
         var12 = 0;
      }

      byte var13 = 0;
      String var14 = "";
      String var15 = "";
      String var16 = "";
      String var17 = "";
      String var18 = "";
      String var19 = "";
      boolean var20 = false;
      boolean var21 = false;
      boolean var22 = false;
      boolean var23 = false;
      int[] var24 = new int[3];
      boolean var25 = false;
      String var26 = "";
      String var27 = "";
      boolean var28 = false;
      return new class196(var2, var7, var8, var9, this.field3969, this.field3970, this.field3968, false, var11, var12, var13, 0, var14, var15, var16, var17, 0, 0, 0, 0, var18, var19, var24, 0, "", "");
   }

   void method2449(String var1) {
      if (var1.startsWith("1.")) {
         this.method2448(var1);
      } else {
         this.method2447(var1);
      }

   }

   void method2448(String var1) {
      String[] var3 = var1.split("\\.");

      try {
         this.field3969 = Integer.parseInt(var3[1]);
         var3 = var3[2].split("_");
         this.field3970 = Integer.parseInt(var3[0]);
         this.field3968 = Integer.parseInt(var3[1]);
      } catch (Exception var5) {
      }

   }

   void method2447(String var1) {
      String[] var3 = var1.split("\\.");

      try {
         this.field3969 = Integer.parseInt(var3[0]);
         this.field3970 = Integer.parseInt(var3[1]);
         this.field3968 = Integer.parseInt(var3[2]);
      } catch (Exception var5) {
      }

   }
}
