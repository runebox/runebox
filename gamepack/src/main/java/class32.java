public class class32 extends class218 {
	public static class215 field476;
	public static class344 field477;
	int field478;
	public int field479;
	public int field480;
	public int field481;
	public int field482;

	static {
		field477 = new class344(64);
	}

	public class32() {
		this.field478 = 0;
	}

	public void method222() {
		this.method225(this.field478);
	}

	public void method223(class42 var1, int var2) {
		while (true) {
			int var4 = var1.method278();
			if (var4 == 0) {
				return;
			}

			this.method224(var1, var4, var2);
		}
	}

	void method224(class42 var1, int var2, int var3) {
		if (var2 == 1) {
			this.field478 = var1.method334();
		}

	}

	void method225(int var1) {
		double var3 = (double)(var1 >> 16 & 255) / 256.0D;
		double var5 = (double)(var1 >> 8 & 255) / 256.0D;
		double var7 = (double)(var1 & 255) / 256.0D;
		double var9 = var3;
		if (var5 < var3) {
			var9 = var5;
		}

		if (var7 < var9) {
			var9 = var7;
		}

		double var11 = var3;
		if (var5 > var3) {
			var11 = var5;
		}

		if (var7 > var11) {
			var11 = var7;
		}

		double var13 = 0.0D;
		double var15 = 0.0D;
		double var17 = (var9 + var11) / 2.0D;
		if (var11 != var9) {
			if (var17 < 0.5D) {
				var15 = (var11 - var9) / (var9 + var11);
			}

			if (var17 >= 0.5D) {
				var15 = (var11 - var9) / (2.0D - var11 - var9);
			}

			if (var3 == var11) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var11 == var5) {
				var13 = (var7 - var3) / (var11 - var9) + 2.0D;
			} else if (var11 == var7) {
				var13 = 4.0D + (var3 - var5) / (var11 - var9);
			}
		}

		var13 /= 6.0D;
		this.field480 = (int)(var15 * 256.0D);
		this.field479 = (int)(var17 * 256.0D);
		if (this.field480 < 0) {
			this.field480 = 0;
		} else if (this.field480 > 255) {
			this.field480 = 255;
		}

		if (this.field479 < 0) {
			this.field479 = 0;
		} else if (this.field479 > 255) {
			this.field479 = 255;
		}

		if (var17 > 0.5D) {
			this.field481 = (int)((1.0D - var17) * var15 * 512.0D);
		} else {
			this.field481 = (int)(var15 * var17 * 512.0D);
		}

		if (this.field481 < 1) {
			this.field481 = 1;
		}

		this.field482 = (int)(var13 * (double)this.field481);
	}
}
