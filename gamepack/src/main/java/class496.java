import java.util.Iterator;

public class class496 {

	public static class338 field3988;

	static Iterator field3990;

	int field3989;

	int field3992;

	int[][] field3991;

	public class496(int var1, int var2) {
		if (var2 != var1) {
			int var4 = var1;
			int var5 = var2;
			if (var2 > var1) {
				var4 = var2;
				var5 = var1;
			}
			while (var5 != 0) {
				int var6 = var4 % var5;
				var4 = var5;
				var5 = var6;
			}
			var1 /= var4;
			var2 /= var4;
			this.field3989 = var1;
			this.field3992 = var2;
			this.field3991 = new int[var1][14];
			for (int var7 = 0; var7 < var1; ++var7) {
				int[] var8 = this.field3991[var7];
				double var9 = 6.0D + (double) var7 / (double) var1;
				int var11 = (int) Math.floor(1.0D + (var9 - 7.0D));
				if (var11 < 0) {
					var11 = 0;
				}
				int var12 = (int) Math.ceil(var9 + 7.0D);
				if (var12 > 14) {
					var12 = 14;
				}
				for (double var13 = (double) var2 / (double) var1; var11 < var12; ++var11) {
					double var15 = ((double) var11 - var9) * 3.141592653589793D;
					double var17 = var13;
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) {
						var17 = var13 * (Math.sin(var15) / var15);
					}
					var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double) var11 - var9));
					var8[var11] = (int) Math.floor(0.5D + var17 * 65536.0D);
				}
			}
		}
	}

	byte[] method2375(byte[] var1) {
		if (null != this.field3991) {
			int var3 = (int) ((long) this.field3992 * (long) var1.length / (long) this.field3989) + 14;
			int[] var4 = new int[var3];
			int var5 = 0;
			int var6 = 0;
			int var7;
			for (var7 = 0; var7 < var1.length; ++var7) {
				byte var8 = var1[var7];
				int[] var9 = this.field3991[var6];
				int var10;
				for (var10 = 0; var10 < 14; ++var10) {
					var4[var10 + var5] += var8 * var9[var10];
				}
				var6 += this.field3992;
				var10 = var6 / this.field3989;
				var5 += var10;
				var6 -= var10 * this.field3989;
			}
			var1 = new byte[var3];
			for (var7 = 0; var7 < var3; ++var7) {
				int var11 = 32768 + var4[var7] >> 16;
				if (var11 < -128) {
					var1[var7] = -128;
				} else if (var11 > 127) {
					var1[var7] = 127;
				} else {
					var1[var7] = (byte) var11;
				}
			}
		}
		return var1;
	}

	int method2376(int var1) {
		if (null != this.field3991) {
			var1 = (int) ((long) var1 * (long) this.field3992 / (long) this.field3989);
		}
		return var1;
	}

	int method2374(int var1) {
		if (this.field3991 != null) {
			var1 = 6 + (int) ((long) var1 * (long) this.field3992 / (long) this.field3989);
		}
		return var1;
	}
}
