public final class class331 extends class415 {
    public int field2417;
    public int field2419;
    public int field2420;
    public int field2421;
    public int field2423;
    public int[] field2422;
    int field2418;

    class331() {
    }

    public class331(int var1, int var2) {
        this(new int[var1 * var2], var1, var2);
    }

    public class331(int[] var1, int var2, int var3) {
        this.field2422 = var1;
        this.field2423 = this.field2420 = var2;
        this.field2419 = this.field2421 = var3;
        this.field2418 = 0;
        this.field2417 = 0;
    }

    static void method1544(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        for (int var8 = -var5; var8 < 0; ++var8) {
            int var9;
            for (var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
                var0[var3++] = var1[var2++];
                var0[var3++] = var1[var2++];
                var0[var3++] = var1[var2++];
            }

            for (var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
            }

            var3 += var6;
            var2 += var7;
        }

    }

    static void method1545(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        int var9 = -(var5 >> 2);
        var5 = -(var5 & 3);

        for (int var10 = -var6; var10 < 0; ++var10) {
            int var11;
            for (var11 = var9; var11 < 0; ++var11) {
                var2 = var1[var3++];
                if (var2 != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                var2 = var1[var3++];
                if (var2 != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                var2 = var1[var3++];
                if (var2 != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                var2 = var1[var3++];
                if (var2 != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }
            }

            for (var11 = var5; var11 < 0; ++var11) {
                var2 = var1[var3++];
                if (var2 != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    static void method1546(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        int var12 = var3;

        for (int var13 = -var8; var13 < 0; ++var13) {
            int var14 = (var4 >> 16) * var11;

            for (int var15 = -var7; var15 < 0; ++var15) {
                var2 = var1[(var3 >> 16) + var14];
                if (var2 != 0) {
                    var0[var5++] = var2;
                } else {
                    ++var5;
                }

                var3 += var9;
            }

            var4 += var10;
            var3 = var12;
            var5 += var6;
        }

    }

    static void method1548(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        boolean var11 = true;
        int var12 = 2130738944;
        int var13 = 8323072;
        var10 = 8355711;

        for (int var14 = -var6; var14 < 0; ++var14) {
            for (int var15 = -var5; var15 < 0; ++var15) {
                var2 = var1[var3++];
                if (var2 != 0) {
                    var12 = (var2 & 16711935) * 128 & -16711936;
                    var13 = (var2 & 65280) * 128 & 16711680;
                    var0[var4++] = ((var12 | var13) >>> 8) + 8355711;
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    static void method1550(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        int var10 = 256 - var9;

        for (int var11 = -var6; var11 < 0; ++var11) {
            for (int var12 = -var5; var12 < 0; ++var12) {
                var2 = var1[var3++];
                if (var2 != 0) {
                    int var13 = var0[var4];
                    var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & 65280) * var9 + (var13 & 65280) * var10 & 16711680) >> 8;
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    static void method1549(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
        int var13 = 256 - var12;
        int var14 = var3;

        for (int var15 = -var8; var15 < 0; ++var15) {
            int var16 = (var4 >> 16) * var11;

            for (int var17 = -var7; var17 < 0; ++var17) {
                var2 = var1[(var3 >> 16) + var16];
                if (var2 != 0) {
                    int var18 = var0[var5];
                    var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936) + ((var2 & 65280) * var12 + (var18 & 65280) * var13 & 16711680) >> 8;
                } else {
                    ++var5;
                }

                var3 += var9;
            }

            var4 += var10;
            var3 = var14;
            var5 += var6;
        }

    }

    static void method1562(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
        for (var8 = -var10; var8 < 0; ++var8) {
            for (var6 = -var9; var6 < 0; ++var6) {
                var0 = var4[var5++];
                if (var0 != 0) {
                    var1 = var3[var7];
                    var2 = var0 + var1;
                    var0 = (var0 & 16711935) + (var1 & 16711935);
                    var1 = (var0 & 16777472) + (var2 - var0 & 65536);
                    var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
                } else {
                    ++var7;
                }
            }

            var7 += var11;
            var5 += var12;
        }

    }

    static void method1560(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
        for (var8 = -var10; var8 < 0; ++var8) {
            for (var6 = -var9; var6 < 0; ++var6) {
                var0 = var4[var5++];
                if (var0 != 0) {
                    var1 = (var0 & 16711935) * 192;
                    var0 = (var1 & -16711936) + (var0 * 192 - var1 & 16711680) >>> 8;
                    var1 = var3[var7];
                    var2 = var0 + var1;
                    var0 = (var0 & 16711935) + (var1 & 16711935);
                    var1 = (var0 & 16777472) + (var2 - var0 & 65536);
                    var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
                } else {
                    ++var7;
                }
            }

            var7 += var11;
            var5 += var12;
        }

    }

    static void method1554(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
        for (int var16 = var3; var8 < 0; ++var8) {
            var7 = (var9 >> 16) * var15;

            for (var6 = -var12; var6 < 0; ++var6) {
                var0 = var4[(var3 >> 16) + var7];
                if (var0 != 0) {
                    var1 = var5[var10];
                    var2 = var0 + var1;
                    var0 = (var0 & 16711935) + (var1 & 16711935);
                    var1 = (var0 & 16777472) + (var2 - var0 & 65536);
                    var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
                } else {
                    ++var10;
                }

                var3 += var13;
            }

            var9 += var14;
            var3 = var16;
            var10 += var11;
        }

    }

    static void method1566(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
        for (int var17 = var3; var8 < 0; ++var8) {
            var7 = (var9 >> 16) * var15;

            for (var6 = -var12; var6 < 0; ++var6) {
                var0 = var4[(var3 >> 16) + var7];
                if (var0 != 0) {
                    var1 = (var0 & 16711935) * 192;
                    var0 = (var1 & -16711936) + (var0 * 192 - var1 & 16711680) >>> 8;
                    var1 = var5[var10];
                    var2 = var0 + var1;
                    var0 = (var0 & 16711935) + (var1 & 16711935);
                    var1 = (var0 & 16777472) + (var2 - var0 & 65536);
                    var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
                } else {
                    ++var10;
                }

                var3 += var13;
            }

            var9 += var14;
            var3 = var17;
            var10 += var11;
        }

    }

    public class331 method1535() {
        class331 var1 = new class331(this.field2423, this.field2419);
        var1.field2420 = this.field2420;
        var1.field2421 = this.field2421;
        var1.field2417 = this.field2420 - this.field2423 - this.field2417;
        var1.field2418 = this.field2418;

        for (int var2 = 0; var2 < this.field2419; ++var2) {
            for (int var3 = 0; var3 < this.field2423; ++var3) {
                var1.field2422[var2 * this.field2423 + var3] = this.field2422[var2 * this.field2423 + this.field2423 - 1 - var3];
            }
        }

        return var1;
    }

    public class331 method1536() {
        class331 var1 = new class331(this.field2423, this.field2419);
        var1.field2420 = this.field2420;
        var1.field2421 = this.field2421;
        var1.field2417 = this.field2417;
        var1.field2418 = this.field2418;
        int var2 = this.field2422.length;

		System.arraycopy(this.field2422, 0, var1.field2422, 0, var2);

        return var1;
    }

    public class331 method1552() {
        class331 var1 = new class331(this.field2420, this.field2421);

        for (int var2 = 0; var2 < this.field2419; ++var2) {
            for (int var3 = 0; var3 < this.field2423; ++var3) {
                var1.field2422[(var2 + this.field2418) * this.field2420 + var3 + this.field2417] = this.field2422[var2 * this.field2423 + var3];
            }
        }

        return var1;
    }

    public void method1537() {
        method1907(this.field2422, this.field2423, this.field2419, null);
    }

    public void method1538() {
        if (this.field2423 != this.field2420 || this.field2419 != this.field2421) {
            int[] var1 = new int[this.field2420 * this.field2421];

            for (int var2 = 0; var2 < this.field2419; ++var2) {
                for (int var3 = 0; var3 < this.field2423; ++var3) {
                    var1[(var2 + this.field2418) * this.field2420 + var3 + this.field2417] = this.field2422[var2 * this.field2423 + var3];
                }
            }

            this.field2422 = var1;
            this.field2423 = this.field2420;
            this.field2419 = this.field2421;
            this.field2417 = 0;
            this.field2418 = 0;
        }
    }

    public void method1539(int var1) {
        if (this.field2423 != this.field2420 || this.field2419 != this.field2421) {
            int var2 = var1;
            if (var1 > this.field2417) {
                var2 = this.field2417;
            }

            int var3 = var1;
            if (var1 + this.field2417 + this.field2423 > this.field2420) {
                var3 = this.field2420 - this.field2417 - this.field2423;
            }

            int var4 = var1;
            if (var1 > this.field2418) {
                var4 = this.field2418;
            }

            int var5 = var1;
            if (var1 + this.field2418 + this.field2419 > this.field2421) {
                var5 = this.field2421 - this.field2418 - this.field2419;
            }

            int var6 = this.field2423 + var2 + var3;
            int var7 = this.field2419 + var4 + var5;
            int[] var8 = new int[var6 * var7];

            for (int var9 = 0; var9 < this.field2419; ++var9) {
                for (int var10 = 0; var10 < this.field2423; ++var10) {
                    var8[(var9 + var4) * var6 + var10 + var2] = this.field2422[var9 * this.field2423 + var10];
                }
            }

            this.field2422 = var8;
            this.field2423 = var6;
            this.field2419 = var7;
            this.field2417 -= var2;
            this.field2418 -= var4;
        }
    }

    public void method1540() {
        int[] var1 = new int[this.field2423 * this.field2419];
        int var2 = 0;

        for (int var3 = 0; var3 < this.field2419; ++var3) {
            for (int var4 = this.field2423 - 1; var4 >= 0; --var4) {
                var1[var2++] = this.field2422[var4 + var3 * this.field2423];
            }
        }

        this.field2422 = var1;
        this.field2417 = this.field2420 - this.field2423 - this.field2417;
    }

    public void method1564() {
        int[] var1 = new int[this.field2423 * this.field2419];
        int var2 = 0;

        for (int var3 = this.field2419 - 1; var3 >= 0; --var3) {
            for (int var4 = 0; var4 < this.field2423; ++var4) {
                var1[var2++] = this.field2422[var4 + var3 * this.field2423];
            }
        }

        this.field2422 = var1;
        this.field2418 = this.field2421 - this.field2419 - this.field2418;
    }

    public void method1541(int var1) {
        int[] var2 = new int[this.field2423 * this.field2419];
        int var3 = 0;

        for (int var4 = 0; var4 < this.field2419; ++var4) {
            for (int var5 = 0; var5 < this.field2423; ++var5) {
                int var6 = this.field2422[var3];
                if (var6 == 0) {
                    if (var5 > 0 && this.field2422[var3 - 1] != 0) {
                        var6 = var1;
                    } else if (var4 > 0 && this.field2422[var3 - this.field2423] != 0) {
                        var6 = var1;
                    } else if (var5 < this.field2423 - 1 && this.field2422[var3 + 1] != 0) {
                        var6 = var1;
                    } else if (var4 < this.field2419 - 1 && this.field2422[var3 + this.field2423] != 0) {
                        var6 = var1;
                    }
                }

                var2[var3++] = var6;
            }
        }

        this.field2422 = var2;
    }

    public void method1542(int var1) {
        for (int var2 = this.field2419 - 1; var2 > 0; --var2) {
            int var3 = var2 * this.field2423;

            for (int var4 = this.field2423 - 1; var4 > 0; --var4) {
                if (this.field2422[var4 + var3] == 0 && this.field2422[var4 + var3 - 1 - this.field2423] != 0) {
                    this.field2422[var4 + var3] = var1;
                }
            }
        }

    }

    public void method1543(int var1, int var2) {
        var1 += this.field2417;
        var2 += this.field2418;
        int var3 = var1 + var2 * class415.field2903;
        int var4 = 0;
        int var5 = this.field2419;
        int var6 = this.field2423;
        int var7 = class415.field2903 - var6;
        int var8 = 0;
        int var9;
        if (var2 < class415.field2909) {
            var9 = class415.field2909 - var2;
            var5 -= var9;
            var2 = class415.field2909;
            var4 = var9 * var6;
            var3 += var9 * class415.field2903;
        }

        if (var2 + var5 > class415.field2907) {
            var5 -= var2 + var5 - class415.field2907;
        }

        if (var1 < class415.field2908) {
            var9 = class415.field2908 - var1;
            var6 -= var9;
            var1 = class415.field2908;
            var4 += var9;
            var3 += var9;
            var8 = var9;
            var7 += var9;
        }

        if (var1 + var6 > class415.field2902) {
            var9 = var1 + var6 - class415.field2902;
            var6 -= var9;
            var8 += var9;
            var7 += var9;
        }

        if (var6 > 0 && var5 > 0) {
            method1544(class415.field2905, this.field2422, var4, var3, var6, var5, var7, var8);
        }
    }

    public void method1563(int var1, int var2) {
        var1 += this.field2417;
        var2 += this.field2418;
        int var3 = var1 + var2 * class415.field2903;
        int var4 = 0;
        int var5 = this.field2419;
        int var6 = this.field2423;
        int var7 = class415.field2903 - var6;
        int var8 = 0;
        int var9;
        if (var2 < class415.field2909) {
            var9 = class415.field2909 - var2;
            var5 -= var9;
            var2 = class415.field2909;
            var4 = var9 * var6;
            var3 += var9 * class415.field2903;
        }

        if (var2 + var5 > class415.field2907) {
            var5 -= var2 + var5 - class415.field2907;
        }

        if (var1 < class415.field2908) {
            var9 = class415.field2908 - var1;
            var6 -= var9;
            var1 = class415.field2908;
            var4 += var9;
            var3 += var9;
            var8 = var9;
            var7 += var9;
        }

        if (var1 + var6 > class415.field2902) {
            var9 = var1 + var6 - class415.field2902;
            var6 -= var9;
            var8 += var9;
            var7 += var9;
        }

        if (var6 > 0 && var5 > 0) {
            method1545(class415.field2905, this.field2422, 0, var4, var3, var6, var5, var7, var8);
        }
    }

    public void method1565(int var1, int var2, int var3, int var4) {
        if (var3 > 0 && var4 > 0) {
            int var5 = this.field2423;
            int var6 = this.field2419;
            int var7 = 0;
            int var8 = 0;
            int var9 = this.field2420;
            int var10 = this.field2421;
            int var11 = (var9 << 16) / var3;
            int var12 = (var10 << 16) / var4;
            int var13;
            if (this.field2417 > 0) {
                var13 = ((this.field2417 << 16) + var11 - 1) / var11;
                var1 += var13;
                var7 = (var13 * var11 - (this.field2417 << 16));
            }

            if (this.field2418 > 0) {
                var13 = ((this.field2418 << 16) + var12 - 1) / var12;
                var2 += var13;
                var8 = (var13 * var12 - (this.field2418 << 16));
            }

            if (var5 < var9) {
                var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
            }

            if (var6 < var10) {
                var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
            }

            var13 = var1 + var2 * class415.field2903;
            int var14 = class415.field2903 - var3;
            if (var2 + var4 > class415.field2907) {
                var4 -= var2 + var4 - class415.field2907;
            }

            int var15;
            if (var2 < class415.field2909) {
                var15 = class415.field2909 - var2;
                var4 -= var15;
                var13 += var15 * class415.field2903;
                var8 += var12 * var15;
            }

            if (var1 + var3 > class415.field2902) {
                var15 = var1 + var3 - class415.field2902;
                var3 -= var15;
                var14 += var15;
            }

            if (var1 < class415.field2908) {
                var15 = class415.field2908 - var1;
                var3 -= var15;
                var13 += var15;
                var7 += var11 * var15;
                var14 += var15;
            }

            method1546(class415.field2905, this.field2422, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
        }
    }

    public void method1547(int var1, int var2, int var3, int var4) {
        var1 += this.field2417;
        var2 += this.field2418;
        int var5 = var1 + var2 * class415.field2903;
        int var6 = 0;
        int var7 = this.field2419;
        int var8 = this.field2423;
        int var9 = class415.field2903 - var8;
        int var10 = 0;
        int var11;
        if (var2 < class415.field2909) {
            var11 = class415.field2909 - var2;
            var7 -= var11;
            var2 = class415.field2909;
            var6 = var11 * var8;
            var5 += var11 * class415.field2903;
        }

        if (var2 + var7 > class415.field2907) {
            var7 -= var2 + var7 - class415.field2907;
        }

        if (var1 < class415.field2908) {
            var11 = class415.field2908 - var1;
            var8 -= var11;
            var1 = class415.field2908;
            var6 += var11;
            var5 += var11;
            var10 = var11;
            var9 += var11;
        }

        if (var1 + var8 > class415.field2902) {
            var11 = var1 + var8 - class415.field2902;
            var8 -= var11;
            var10 += var11;
            var9 += var11;
        }

        if (var8 > 0 && var7 > 0) {
            method1548(class415.field2905, this.field2422, 0, var6, var5, var8, var7, var9, var10, 128, 16777215);
        }
    }

    public void method1561(int var1, int var2, int var3) {
        var1 += this.field2417;
        var2 += this.field2418;
        int var4 = var1 + var2 * class415.field2903;
        int var5 = 0;
        int var6 = this.field2419;
        int var7 = this.field2423;
        int var8 = class415.field2903 - var7;
        int var9 = 0;
        int var10;
        if (var2 < class415.field2909) {
            var10 = class415.field2909 - var2;
            var6 -= var10;
            var2 = class415.field2909;
            var5 = var10 * var7;
            var4 += var10 * class415.field2903;
        }

        if (var2 + var6 > class415.field2907) {
            var6 -= var2 + var6 - class415.field2907;
        }

        if (var1 < class415.field2908) {
            var10 = class415.field2908 - var1;
            var7 -= var10;
            var1 = class415.field2908;
            var5 += var10;
            var4 += var10;
            var9 = var10;
            var8 += var10;
        }

        if (var1 + var7 > class415.field2902) {
            var10 = var1 + var7 - class415.field2902;
            var7 -= var10;
            var9 += var10;
            var8 += var10;
        }

        if (var7 > 0 && var6 > 0) {
            method1550(class415.field2905, this.field2422, 0, var5, var4, var7, var6, var8, var9, var3);
        }
    }

    public void method1551(int var1, int var2, int var3, int var4, int var5) {
        if (var3 > 0 && var4 > 0) {
            int var6 = this.field2423;
            int var7 = this.field2419;
            int var8 = 0;
            int var9 = 0;
            int var10 = this.field2420;
            int var11 = this.field2421;
            int var12 = (var10 << 16) / var3;
            int var13 = (var11 << 16) / var4;
            int var14;
            if (this.field2417 > 0) {
                var14 = ((this.field2417 << 16) + var12 - 1) / var12;
                var1 += var14;
                var8 = (var14 * var12 - (this.field2417 << 16));
            }

            if (this.field2418 > 0) {
                var14 = ((this.field2418 << 16) + var13 - 1) / var13;
                var2 += var14;
                var9 = (var14 * var13 - (this.field2418 << 16));
            }

            if (var6 < var10) {
                var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
            }

            if (var7 < var11) {
                var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
            }

            var14 = var1 + var2 * class415.field2903;
            int var15 = class415.field2903 - var3;
            if (var2 + var4 > class415.field2907) {
                var4 -= var2 + var4 - class415.field2907;
            }

            int var16;
            if (var2 < class415.field2909) {
                var16 = class415.field2909 - var2;
                var4 -= var16;
                var14 += var16 * class415.field2903;
                var9 += var13 * var16;
            }

            if (var1 + var3 > class415.field2902) {
                var16 = var1 + var3 - class415.field2902;
                var3 -= var16;
                var15 += var16;
            }

            if (var1 < class415.field2908) {
                var16 = class415.field2908 - var1;
                var3 -= var16;
                var14 += var16;
                var8 += var12 * var16;
                var15 += var16;
            }

            method1549(class415.field2905, this.field2422, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
        }
    }

    public void method1567(int var1, int var2, int var3) {
        var1 += this.field2417;
        var2 += this.field2418;
        int var4 = var1 + var2 * class415.field2903;
        int var5 = 0;
        int var6 = this.field2419;
        int var7 = this.field2423;
        int var8 = class415.field2903 - var7;
        int var9 = 0;
        int var10;
        if (var2 < class415.field2909) {
            var10 = class415.field2909 - var2;
            var6 -= var10;
            var2 = class415.field2909;
            var5 = var10 * var7;
            var4 += var10 * class415.field2903;
        }

        if (var2 + var6 > class415.field2907) {
            var6 -= var2 + var6 - class415.field2907;
        }

        if (var1 < class415.field2908) {
            var10 = class415.field2908 - var1;
            var7 -= var10;
            var1 = class415.field2908;
            var5 += var10;
            var4 += var10;
            var9 = var10;
            var8 += var10;
        }

        if (var1 + var7 > class415.field2902) {
            var10 = var1 + var7 - class415.field2902;
            var7 -= var10;
            var9 += var10;
            var8 += var10;
        }

        if (var7 > 0 && var6 > 0) {
            method1560(0, 0, 0, class415.field2905, this.field2422, var5, 0, var4, 0, var7, var6, var8, var9, 192);
        }
    }

    public void method1553(int var1, int var2, int var3, int var4, int var5) {
        if (var3 > 0 && var4 > 0) {
            int var6 = this.field2423;
            int var7 = this.field2419;
            int var8 = 0;
            int var9 = 0;
            int var10 = this.field2420;
            int var11 = this.field2421;
            int var12 = (var10 << 16) / var3;
            int var13 = (var11 << 16) / var4;
            int var14;
            if (this.field2417 > 0) {
                var14 = ((this.field2417 << 16) + var12 - 1) / var12;
                var1 += var14;
                var8 = (var14 * var12 - (this.field2417 << 16));
            }

            if (this.field2418 > 0) {
                var14 = ((this.field2418 << 16) + var13 - 1) / var13;
                var2 += var14;
                var9 = (var14 * var13 - (this.field2418 << 16));
            }

            if (var6 < var10) {
                var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
            }

            if (var7 < var11) {
                var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
            }

            var14 = var1 + var2 * class415.field2903;
            int var15 = class415.field2903 - var3;
            if (var2 + var4 > class415.field2907) {
                var4 -= var2 + var4 - class415.field2907;
            }

            int var16;
            if (var2 < class415.field2909) {
                var16 = class415.field2909 - var2;
                var4 -= var16;
                var14 += var16 * class415.field2903;
                var9 += var13 * var16;
            }

            if (var1 + var3 > class415.field2902) {
                var16 = var1 + var3 - class415.field2902;
                var3 -= var16;
                var15 += var16;
            }

            if (var1 < class415.field2908) {
                var16 = class415.field2908 - var1;
                var3 -= var16;
                var14 += var16;
                var8 += var12 * var16;
                var15 += var16;
            }

            method1566(0, 0, 0, var8, this.field2422, class415.field2905, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, 192);
        }
    }

    public void method1555(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
        int var9 = var2 < 0 ? -var2 : 0;
        int var10 = var2 + this.field2419 <= var6 ? this.field2419 : var6 - var2;
        int var11 = var1 < 0 ? -var1 : 0;
        int var10000;
        if (var1 + this.field2423 <= var5) {
            var10000 = this.field2423;
        } else {
            var10000 = var5 - var1;
        }

        int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * class415.field2903;
        int var14 = var2 + var9;

        for (int var15 = var9; var15 < var10; ++var15) {
            int var16 = var7[var14];
            int var17 = var8[var14++];
            int var18 = var13;
            int var19;
            if (var1 < var16) {
                var19 = var16 - var1;
                var18 = var13 + (var19 - var11);
            } else {
                var19 = var11;
            }

            int var12;
            if (var1 + this.field2423 <= var16 + var17) {
                var12 = this.field2423;
            } else {
                var12 = var16 + var17 - var1;
            }

            for (int var20 = var19; var20 < var12; ++var20) {
                int var21 = this.field2422[var20 + var15 * this.field2423];
                if (var21 != 0) {
                    class415.field2905[var18++] = var21;
                } else {
                    ++var18;
                }
            }

            var13 += class415.field2903;
        }

    }

    public void method1556(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
        try {
            int var11 = -var3 / 2;
            int var12 = -var4 / 2;
            int var13 = (int) (Math.sin((double) var7 / 326.11D) * 65536.0D);
            int var14 = (int) (Math.cos((double) var7 / 326.11D) * 65536.0D);
            var13 = var13 * 256 >> 8;
            var14 = var14 * 256 >> 8;
            int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
            int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
            int var17 = var1 + var2 * class415.field2903;

            for (var2 = 0; var2 < var4; ++var2) {
                int var18 = var9[var2];
                int var19 = var17 + var18;
                int var20 = var15 + var14 * var18;
                int var21 = var16 - var13 * var18;

                for (var1 = -var10[var2]; var1 < 0; ++var1) {
                    class415.field2905[var19++] = this.field2422[(var20 >> 16) + (var21 >> 16) * this.field2423];
                    var20 += var14;
                    var21 -= var13;
                }

                var15 += var13;
                var16 += var14;
                var17 += class415.field2903;
            }
        } catch (Exception var22) {
        }

    }

    public void method1534(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
        try {
            boolean var10 = true;
            boolean var11 = true;
            int var12 = (int) (Math.sin(var7) * 65536.0D);
            int var13 = (int) (Math.cos(var7) * 65536.0D);
            var12 = var12 * 256 >> 8;
            var13 = var13 * 256 >> 8;
            int var14 = 983040 + -10 * var12 + -10 * var13;
            int var15 = 983040 + (-10 * var13 - -10 * var12);
            int var16 = var1 + var2 * class415.field2903;

            for (var2 = 0; var2 < 20; ++var2) {
                int var17 = var16;
                int var18 = var14;
                int var19 = var15;

                for (var1 = -20; var1 < 0; ++var1) {
                    int var20 = this.field2422[(var18 >> 16) + (var19 >> 16) * this.field2423];
                    if (var20 != 0) {
                        class415.field2905[var17++] = var20;
                    } else {
                        ++var17;
                    }

                    var18 += var13;
                    var19 -= var12;
                }

                var14 += var12;
                var15 += var13;
                var16 += class415.field2903;
            }
        } catch (Exception var21) {
        }

    }

    public void method1557(int var1, int var2, int var3, int var4) {
        this.method1558(this.field2420 << 3, this.field2421 << 3, var1 << 4, var2 << 4, var3, var4);
    }

    void method1558(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (var6 != 0) {
            var1 -= this.field2417 << 4;
            var2 -= this.field2418 << 4;
            double var7 = (double) (var5 & 65535) * 9.587379924285257E-5D;
            int var9 = (int) Math.floor(Math.sin(var7) * (double) var6 + 0.5D);
            int var10 = (int) Math.floor(Math.cos(var7) * (double) var6 + 0.5D);
            int var11 = -var1 * var10 + -var2 * var9;
            int var12 = -(-var1) * var9 + -var2 * var10;
            int var13 = ((this.field2423 << 4) - var1) * var10 + -var2 * var9;
            int var14 = -((this.field2423 << 4) - var1) * var9 + -var2 * var10;
            int var15 = -var1 * var10 + ((this.field2419 << 4) - var2) * var9;
            int var16 = -(-var1) * var9 + ((this.field2419 << 4) - var2) * var10;
            int var17 = ((this.field2423 << 4) - var1) * var10 + ((this.field2419 << 4) - var2) * var9;
            int var18 = -((this.field2423 << 4) - var1) * var9 + ((this.field2419 << 4) - var2) * var10;
            int var19;
            int var20;
            if (var11 < var13) {
                var19 = var11;
                var20 = var13;
            } else {
                var19 = var13;
                var20 = var11;
            }

            if (var15 < var19) {
                var19 = var15;
            }

            if (var17 < var19) {
                var19 = var17;
            }

            if (var15 > var20) {
                var20 = var15;
            }

            if (var17 > var20) {
                var20 = var17;
            }

            int var21;
            int var22;
            if (var12 < var14) {
                var21 = var12;
                var22 = var14;
            } else {
                var21 = var14;
                var22 = var12;
            }

            if (var16 < var21) {
                var21 = var16;
            }

            if (var18 < var21) {
                var21 = var18;
            }

            if (var16 > var22) {
                var22 = var16;
            }

            if (var18 > var22) {
                var22 = var18;
            }

            var19 >>= 12;
            var20 = var20 + 4095 >> 12;
            var21 >>= 12;
            var22 = var22 + 4095 >> 12;
            var19 += var3;
            var20 += var3;
            var21 += var4;
            var22 += var4;
            var19 >>= 4;
            var20 = var20 + 15 >> 4;
            var21 >>= 4;
            var22 = var22 + 15 >> 4;
            if (var19 < class415.field2908) {
                var19 = class415.field2908;
            }

            if (var20 > class415.field2902) {
                var20 = class415.field2902;
            }

            if (var21 < class415.field2909) {
                var21 = class415.field2909;
            }

            if (var22 > class415.field2907) {
                var22 = class415.field2907;
            }

            var20 = var19 - var20;
            if (var20 < 0) {
                var22 = var21 - var22;
                if (var22 < 0) {
                    int var23 = var21 * class415.field2903 + var19;
                    double var24 = 1.6777216E7D / (double) var6;
                    int var26 = (int) Math.floor(Math.sin(var7) * var24 + 0.5D);
                    int var27 = (int) Math.floor(Math.cos(var7) * var24 + 0.5D);
                    int var28 = (var19 << 4) + 8 - var3;
                    int var29 = (var21 << 4) + 8 - var4;
                    int var30 = (var1 << 8) - (var29 * var26 >> 4);
                    int var31 = (var2 << 8) + (var29 * var27 >> 4);
                    int var32;
                    int var33;
                    int var34;
                    int var35;
                    int var36;
                    int var37;
                    int var38;
                    if (var27 == 0) {
                        if (var26 == 0) {
                            for (var33 = var22; var33 < 0; var23 += class415.field2903) {
                                var34 = var23;
                                var35 = var30;
                                var36 = var31;
                                var37 = var20;
                                if (var30 >= 0 && var31 >= 0 && var30 - (this.field2423 << 12) < 0 && var31 - (this.field2419 << 12) < 0) {
                                    for (; var37 < 0; ++var37) {
                                        var38 = this.field2422[(var36 >> 12) * this.field2423 + (var35 >> 12)];
                                        if (var38 != 0) {
                                            class415.field2905[var34++] = var38;
                                        } else {
                                            ++var34;
                                        }
                                    }
                                }

                                ++var33;
                            }
                        } else if (var26 < 0) {
                            for (var33 = var22; var33 < 0; var23 += class415.field2903) {
                                var34 = var23;
                                var35 = var30;
                                var36 = var31 + (var28 * var26 >> 4);
                                var37 = var20;
                                if (var30 >= 0 && var30 - (this.field2423 << 12) < 0) {
                                    if ((var32 = var36 - (this.field2419 << 12)) >= 0) {
                                        var32 = (var26 - var32) / var26;
                                        var37 = var20 + var32;
                                        var36 += var26 * var32;
                                        var34 = var23 + var32;
                                    }

                                    if ((var32 = (var36 - var26) / var26) > var37) {
                                        var37 = var32;
                                    }

                                    while (var37 < 0) {
                                        var38 = this.field2422[(var36 >> 12) * this.field2423 + (var35 >> 12)];
                                        if (var38 != 0) {
                                            class415.field2905[var34++] = var38;
                                        } else {
                                            ++var34;
                                        }

                                        var36 += var26;
                                        ++var37;
                                    }
                                }

                                ++var33;
                                var30 -= var26;
                            }
                        } else {
                            for (var33 = var22; var33 < 0; var23 += class415.field2903) {
                                var34 = var23;
                                var35 = var30;
                                var36 = var31 + (var28 * var26 >> 4);
                                var37 = var20;
                                if (var30 >= 0 && var30 - (this.field2423 << 12) < 0) {
                                    if (var36 < 0) {
                                        var32 = (var26 - 1 - var36) / var26;
                                        var37 = var20 + var32;
                                        var36 += var26 * var32;
                                        var34 = var23 + var32;
                                    }

                                    if ((var32 = (var36 + 1 - (this.field2419 << 12) - var26) / var26) > var37) {
                                        var37 = var32;
                                    }

                                    while (var37 < 0) {
                                        var38 = this.field2422[(var36 >> 12) * this.field2423 + (var35 >> 12)];
                                        if (var38 != 0) {
                                            class415.field2905[var34++] = var38;
                                        } else {
                                            ++var34;
                                        }

                                        var36 += var26;
                                        ++var37;
                                    }
                                }

                                ++var33;
                                var30 -= var26;
                            }
                        }
                    } else if (var27 < 0) {
                        if (var26 == 0) {
                            for (var33 = var22; var33 < 0; var23 += class415.field2903) {
                                var34 = var23;
                                var35 = var30 + (var28 * var27 >> 4);
                                var36 = var31;
                                var37 = var20;
                                if (var31 >= 0 && var31 - (this.field2419 << 12) < 0) {
                                    if ((var32 = var35 - (this.field2423 << 12)) >= 0) {
                                        var32 = (var27 - var32) / var27;
                                        var37 = var20 + var32;
                                        var35 += var27 * var32;
                                        var34 = var23 + var32;
                                    }

                                    if ((var32 = (var35 - var27) / var27) > var37) {
                                        var37 = var32;
                                    }

                                    while (var37 < 0) {
                                        var38 = this.field2422[(var36 >> 12) * this.field2423 + (var35 >> 12)];
                                        if (var38 != 0) {
                                            class415.field2905[var34++] = var38;
                                        } else {
                                            ++var34;
                                        }

                                        var35 += var27;
                                        ++var37;
                                    }
                                }

                                ++var33;
                                var31 += var27;
                            }
                        } else if (var26 < 0) {
                            for (var33 = var22; var33 < 0; var23 += class415.field2903) {
                                var34 = var23;
                                var35 = var30 + (var28 * var27 >> 4);
                                var36 = var31 + (var28 * var26 >> 4);
                                var37 = var20;
                                if ((var32 = var35 - (this.field2423 << 12)) >= 0) {
                                    var32 = (var27 - var32) / var27;
                                    var37 = var20 + var32;
                                    var35 += var27 * var32;
                                    var36 += var26 * var32;
                                    var34 = var23 + var32;
                                }

                                if ((var32 = (var35 - var27) / var27) > var37) {
                                    var37 = var32;
                                }

                                if ((var32 = var36 - (this.field2419 << 12)) >= 0) {
                                    var32 = (var26 - var32) / var26;
                                    var37 += var32;
                                    var35 += var27 * var32;
                                    var36 += var26 * var32;
                                    var34 += var32;
                                }

                                if ((var32 = (var36 - var26) / var26) > var37) {
                                    var37 = var32;
                                }

                                while (var37 < 0) {
                                    var38 = this.field2422[(var36 >> 12) * this.field2423 + (var35 >> 12)];
                                    if (var38 != 0) {
                                        class415.field2905[var34++] = var38;
                                    } else {
                                        ++var34;
                                    }

                                    var35 += var27;
                                    var36 += var26;
                                    ++var37;
                                }

                                ++var33;
                                var30 -= var26;
                                var31 += var27;
                            }
                        } else {
                            for (var33 = var22; var33 < 0; var23 += class415.field2903) {
                                var34 = var23;
                                var35 = var30 + (var28 * var27 >> 4);
                                var36 = var31 + (var28 * var26 >> 4);
                                var37 = var20;
                                if ((var32 = var35 - (this.field2423 << 12)) >= 0) {
                                    var32 = (var27 - var32) / var27;
                                    var37 = var20 + var32;
                                    var35 += var27 * var32;
                                    var36 += var26 * var32;
                                    var34 = var23 + var32;
                                }

                                if ((var32 = (var35 - var27) / var27) > var37) {
                                    var37 = var32;
                                }

                                if (var36 < 0) {
                                    var32 = (var26 - 1 - var36) / var26;
                                    var37 += var32;
                                    var35 += var27 * var32;
                                    var36 += var26 * var32;
                                    var34 += var32;
                                }

                                if ((var32 = (var36 + 1 - (this.field2419 << 12) - var26) / var26) > var37) {
                                    var37 = var32;
                                }

                                while (var37 < 0) {
                                    var38 = this.field2422[(var36 >> 12) * this.field2423 + (var35 >> 12)];
                                    if (var38 != 0) {
                                        class415.field2905[var34++] = var38;
                                    } else {
                                        ++var34;
                                    }

                                    var35 += var27;
                                    var36 += var26;
                                    ++var37;
                                }

                                ++var33;
                                var30 -= var26;
                                var31 += var27;
                            }
                        }
                    } else if (var26 == 0) {
                        for (var33 = var22; var33 < 0; var23 += class415.field2903) {
                            var34 = var23;
                            var35 = var30 + (var28 * var27 >> 4);
                            var36 = var31;
                            var37 = var20;
                            if (var31 >= 0 && var31 - (this.field2419 << 12) < 0) {
                                if (var35 < 0) {
                                    var32 = (var27 - 1 - var35) / var27;
                                    var37 = var20 + var32;
                                    var35 += var27 * var32;
                                    var34 = var23 + var32;
                                }

                                if ((var32 = (var35 + 1 - (this.field2423 << 12) - var27) / var27) > var37) {
                                    var37 = var32;
                                }

                                while (var37 < 0) {
                                    var38 = this.field2422[(var36 >> 12) * this.field2423 + (var35 >> 12)];
                                    if (var38 != 0) {
                                        class415.field2905[var34++] = var38;
                                    } else {
                                        ++var34;
                                    }

                                    var35 += var27;
                                    ++var37;
                                }
                            }

                            ++var33;
                            var31 += var27;
                        }
                    } else if (var26 < 0) {
                        for (var33 = var22; var33 < 0; var23 += class415.field2903) {
                            var34 = var23;
                            var35 = var30 + (var28 * var27 >> 4);
                            var36 = var31 + (var28 * var26 >> 4);
                            var37 = var20;
                            if (var35 < 0) {
                                var32 = (var27 - 1 - var35) / var27;
                                var37 = var20 + var32;
                                var35 += var27 * var32;
                                var36 += var26 * var32;
                                var34 = var23 + var32;
                            }

                            if ((var32 = (var35 + 1 - (this.field2423 << 12) - var27) / var27) > var37) {
                                var37 = var32;
                            }

                            if ((var32 = var36 - (this.field2419 << 12)) >= 0) {
                                var32 = (var26 - var32) / var26;
                                var37 += var32;
                                var35 += var27 * var32;
                                var36 += var26 * var32;
                                var34 += var32;
                            }

                            if ((var32 = (var36 - var26) / var26) > var37) {
                                var37 = var32;
                            }

                            while (var37 < 0) {
                                var38 = this.field2422[(var36 >> 12) * this.field2423 + (var35 >> 12)];
                                if (var38 != 0) {
                                    class415.field2905[var34++] = var38;
                                } else {
                                    ++var34;
                                }

                                var35 += var27;
                                var36 += var26;
                                ++var37;
                            }

                            ++var33;
                            var30 -= var26;
                            var31 += var27;
                        }
                    } else {
                        for (var33 = var22; var33 < 0; var23 += class415.field2903) {
                            var34 = var23;
                            var35 = var30 + (var28 * var27 >> 4);
                            var36 = var31 + (var28 * var26 >> 4);
                            var37 = var20;
                            if (var35 < 0) {
                                var32 = (var27 - 1 - var35) / var27;
                                var37 = var20 + var32;
                                var35 += var27 * var32;
                                var36 += var26 * var32;
                                var34 = var23 + var32;
                            }

                            if ((var32 = (var35 + 1 - (this.field2423 << 12) - var27) / var27) > var37) {
                                var37 = var32;
                            }

                            if (var36 < 0) {
                                var32 = (var26 - 1 - var36) / var26;
                                var37 += var32;
                                var35 += var27 * var32;
                                var36 += var26 * var32;
                                var34 += var32;
                            }

                            if ((var32 = (var36 + 1 - (this.field2419 << 12) - var26) / var26) > var37) {
                                var37 = var32;
                            }

                            while (var37 < 0) {
                                var38 = this.field2422[(var36 >> 12) * this.field2423 + (var35 >> 12)];
                                if (var38 != 0) {
                                    class415.field2905[var34++] = var38;
                                } else {
                                    ++var34;
                                }

                                var35 += var27;
                                var36 += var26;
                                ++var37;
                            }

                            ++var33;
                            var30 -= var26;
                            var31 += var27;
                        }
                    }

                }
            }
        }
    }

    public void method1559(int var1, int var2, int var3, int var4) {
        if (var3 <= this.field2420 && var4 <= this.field2421) {
            int var5 = var1 + this.field2417 * var3 / this.field2420;
            int var6 = var1 + ((this.field2417 + this.field2423) * var3 + this.field2420 - 1) / this.field2420;
            int var7 = var2 + this.field2418 * var4 / this.field2421;
            int var8 = var2 + ((this.field2418 + this.field2419) * var4 + this.field2421 - 1) / this.field2421;
            if (var5 < class415.field2908) {
                var5 = class415.field2908;
            }

            if (var6 > class415.field2902) {
                var6 = class415.field2902;
            }

            if (var7 < class415.field2909) {
                var7 = class415.field2909;
            }

            if (var8 > class415.field2907) {
                var8 = class415.field2907;
            }

            if (var5 < var6 && var7 < var8) {
                int var9 = var7 * class415.field2903 + var5;
                int var10 = class415.field2903 - (var6 - var5);
                if (var9 < class415.field2905.length) {
                    for (int var11 = var7; var11 < var8; ++var11) {
                        for (int var12 = var5; var12 < var6; ++var12) {
                            int var13 = var12 - var1 << 4;
                            int var14 = var11 - var2 << 4;
                            int var15 = var13 * this.field2420 / var3 - (this.field2417 << 4);
                            int var16 = (var13 + 16) * this.field2420 / var3 - (this.field2417 << 4);
                            int var17 = var14 * this.field2421 / var4 - (this.field2418 << 4);
                            int var18 = (var14 + 16) * this.field2421 / var4 - (this.field2418 << 4);
                            int var19 = (var16 - var15) * (var18 - var17) >> 1;
                            if (var19 != 0) {
                                if (var15 < 0) {
                                    var15 = 0;
                                }

                                if (var16 >= this.field2423 << 4) {
                                    var16 = this.field2423 << 4;
                                }

                                if (var17 < 0) {
                                    var17 = 0;
                                }

                                if (var18 >= this.field2419 << 4) {
                                    var18 = this.field2419 << 4;
                                }

                                --var16;
                                --var18;
                                int var20 = 16 - (var15 & 15);
                                int var21 = (var16 & 15) + 1;
                                int var22 = 16 - (var17 & 15);
                                int var23 = (var18 & 15) + 1;
                                var15 >>= 4;
                                var16 >>= 4;
                                var17 >>= 4;
                                var18 >>= 4;
                                int var24 = 0;
                                int var25 = 0;
                                int var26 = 0;
                                int var27 = 0;

                                int var28;
                                for (var28 = var17; var28 <= var18; ++var28) {
                                    int var29 = 16;
                                    if (var28 == var17) {
                                        var29 = var22;
                                    }

                                    if (var28 == var18) {
                                        var29 = var23;
                                    }

                                    for (int var30 = var15; var30 <= var16; ++var30) {
                                        int var31 = this.field2422[var28 * this.field2423 + var30];
                                        if (var31 != 0) {
                                            int var32;
                                            if (var30 == var15) {
                                                var32 = var29 * var20;
                                            } else if (var30 == var16) {
                                                var32 = var29 * var21;
                                            } else {
                                                var32 = var29 << 4;
                                            }

                                            var27 += var32;
                                            var24 += (var31 >> 16 & 255) * var32;
                                            var25 += (var31 >> 8 & 255) * var32;
                                            var26 += (var31 & 255) * var32;
                                        }
                                    }
                                }

                                if (var27 >= var19) {
                                    var28 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                                    if (var28 == 0) {
                                        var28 = 1;
                                    }

                                    class415.field2905[var9] = var28;
                                }

                                ++var9;
                            }
                        }

                        var9 += var10;
                    }

                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
