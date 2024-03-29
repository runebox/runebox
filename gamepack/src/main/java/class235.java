import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class class235 implements class375 {

	final MessageDigest field2027;

	class235(class196 var1) {
		this.field2027 = this.method1380();
	}

	boolean method1382(int var1, String var2, long var3) {
		byte[] var5 = this.method1379(var2, var3);
		return method1378(var5) >= var1;
	}

	byte[] method1379(String var1, long var2) {
		StringBuilder var4 = new StringBuilder();
		var4.append(var1).append(Long.toHexString(var2));
		this.field2027.reset();
		try {
			this.field2027.update(var4.toString().getBytes("UTF-8"));
		} catch (UnsupportedEncodingException var6) {
			var6.printStackTrace();
		}
		return this.field2027.digest();
	}

	MessageDigest method1380() {
		try {
			return MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException var2) {
			var2.printStackTrace();
			return null;
		}
	}

	static int method1378(byte[] var0) {
		int var1 = 0;
		byte[] var2 = var0;
		for (int var3 = 0; var3 < var2.length; ++var3) {
			byte var4 = var2[var3];
			int var5 = method1381(var4);
			var1 += var5;
			if (var5 != 8) {
				break;
			}
		}
		return var1;
	}

	static int method1381(byte var0) {
		int var1 = 0;
		if (var0 == 0) {
			var1 = 8;
		} else {
			for (int var2 = var0 & 255; (var2 & 128) == 0; var2 <<= 1) {
				++var1;
			}
		}
		return var1;
	}
}
