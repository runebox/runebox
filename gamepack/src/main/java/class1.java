public class class1 {

	static final char[] field1;

	static final char[] field2;

	static {
		field2 = new char[] { ' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df' };
		field1 = new char[] { '[', ']', '#' };
	}

	class1() throws Throwable {
	}

	public static final boolean method2(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class514.method2480(var0)) {
			return true;
		} else {
			char[] var2 = field2;
			int var3;
			char var4;
			for (var3 = 0; var3 < var2.length; ++var3) {
				var4 = var2[var3];
				if (var0 == var4) {
					return true;
				}
			}
			var2 = field1;
			for (var3 = 0; var3 < var2.length; ++var3) {
				var4 = var2[var3];
				if (var0 == var4) {
					return true;
				}
			}
			return false;
		}
	}

	public static final boolean method4(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	public static char method1(char var0) {
		switch(var0) {
			case ' ':
			case '-':
			case '_':
			case '\u00a0':
				return '_';
			case '#':
			case '[':
			case ']':
				return var0;
			case '\u00c0':
			case '\u00c1':
			case '\u00c2':
			case '\u00c3':
			case '\u00c4':
			case '\u00e0':
			case '\u00e1':
			case '\u00e2':
			case '\u00e3':
			case '\u00e4':
				return 'a';
			case '\u00c7':
			case '\u00e7':
				return 'c';
			case '\u00c8':
			case '\u00c9':
			case '\u00ca':
			case '\u00cb':
			case '\u00e8':
			case '\u00e9':
			case '\u00ea':
			case '\u00eb':
				return 'e';
			case '\u00cd':
			case '\u00ce':
			case '\u00cf':
			case '\u00ed':
			case '\u00ee':
			case '\u00ef':
				return 'i';
			case '\u00d1':
			case '\u00f1':
				return 'n';
			case '\u00d2':
			case '\u00d3':
			case '\u00d4':
			case '\u00d5':
			case '\u00d6':
			case '\u00f2':
			case '\u00f3':
			case '\u00f4':
			case '\u00f5':
			case '\u00f6':
				return 'o';
			case '\u00d9':
			case '\u00da':
			case '\u00db':
			case '\u00dc':
			case '\u00f9':
			case '\u00fa':
			case '\u00fb':
			case '\u00fc':
				return 'u';
			case '\u00df':
				return 'b';
			case '\u00ff':
			case '\u0178':
				return 'y';
			default:
				return Character.toLowerCase(var0);
		}
	}

	public static String method3(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}
}
