import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class class523 {

	public static class292 field4167;

	static String field4166;

	static {
		field4167 = new class292();
	}

	class523() throws Throwable {
	}

	public static void method2562() {
		field4167 = new class292();
	}

	public static void method2561(class515 var0) {
		class366 var2 = (class366) field4167.method1585();
		if (var2 != null) {
			int var3 = var0.field1832;
			var0.method1151(var2.field2927);
			for (int var4 = 0; var4 < var2.field2926; ++var4) {
				if (var2.field2929[var4] != 0) {
					var0.method1085(var2.field2929[var4]);
				} else {
					try {
						int var5 = var2.field2934[var4];
						Field var6;
						int var7;
						if (var5 == 0) {
							var6 = var2.field2933[var4];
							var7 = var6.getInt((Object) null);
							var0.method1085(0);
							var0.method1151(var7);
						} else if (var5 == 1) {
							var6 = var2.field2933[var4];
							var6.setInt((Object) null, var2.field2931[var4]);
							var0.method1085(0);
						} else if (var5 == 2) {
							var6 = var2.field2933[var4];
							var7 = var6.getModifiers();
							var0.method1085(0);
							var0.method1151(var7);
						}
						Method var23;
						if (var5 != 3) {
							if (var5 == 4) {
								var23 = var2.field2932[var4];
								var7 = var23.getModifiers();
								var0.method1085(0);
								var0.method1151(var7);
							}
						} else {
							var23 = var2.field2932[var4];
							byte[][] var24 = var2.field2928[var4];
							Object[] var8 = new Object[var24.length];
							for (int var9 = 0; var9 < var24.length; ++var9) {
								ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var24[var9]));
								var8[var9] = var10.readObject();
							}
							Object var25 = var23.invoke((Object) null, var8);
							if (null == var25) {
								var0.method1085(0);
							} else if (var25 instanceof Number) {
								var0.method1085(1);
								var0.method1122(((Number) var25).longValue());
							} else if (var25 instanceof String) {
								var0.method1085(2);
								var0.method1088((String) var25);
							} else {
								var0.method1085(4);
							}
						}
					} catch (ClassNotFoundException var11) {
						var0.method1085(-10);
					} catch (InvalidClassException var12) {
						var0.method1085(-11);
					} catch (StreamCorruptedException var13) {
						var0.method1085(-12);
					} catch (OptionalDataException var14) {
						var0.method1085(-13);
					} catch (IllegalAccessException var15) {
						var0.method1085(-14);
					} catch (IllegalArgumentException var16) {
						var0.method1085(-15);
					} catch (InvocationTargetException var17) {
						var0.method1085(-16);
					} catch (SecurityException var18) {
						var0.method1085(-17);
					} catch (IOException var19) {
						var0.method1085(-18);
					} catch (NullPointerException var20) {
						var0.method1085(-19);
					} catch (Exception var21) {
						var0.method1085(-20);
					} catch (Throwable var22) {
						var0.method1085(-21);
					}
				}
			}
			var0.method1114(var3);
			var2.method318();
		}
	}

	public static void method2559(class187 var0, int var1) {
		class366 var3 = new class366();
		var3.field2926 = var0.method1096();
		var3.field2927 = var0.method1100();
		var3.field2934 = new int[var3.field2926];
		var3.field2929 = new int[var3.field2926];
		var3.field2933 = new Field[var3.field2926];
		var3.field2931 = new int[var3.field2926];
		var3.field2932 = new Method[var3.field2926];
		var3.field2928 = new byte[var3.field2926][][];
		for (int var4 = 0; var4 < var3.field2926; ++var4) {
			try {
				int var5 = var0.method1096();
				String var6;
				String var7;
				int var8;
				if (var5 != 0 && var5 != 1 && var5 != 2) {
					if (var5 == 3 || var5 == 4) {
						var6 = var0.method1104();
						var7 = var0.method1104();
						var8 = var0.method1096();
						String[] var9 = new String[var8];
						for (int var10 = 0; var10 < var8; ++var10) {
							var9[var10] = var0.method1104();
						}
						String var26 = var0.method1104();
						byte[][] var11 = new byte[var8][];
						int var13;
						if (var5 == 3) {
							for (int var12 = 0; var12 < var8; ++var12) {
								var13 = var0.method1100();
								var11[var12] = new byte[var13];
								var0.method1106(var11[var12], 0, var13);
							}
						}
						var3.field2934[var4] = var5;
						Class[] var27 = new Class[var8];
						for (var13 = 0; var13 < var8; ++var13) {
							var27[var13] = method2560(var9[var13]);
						}
						Class var28 = method2560(var26);
						if (method2560(var6).getClassLoader() == null) {
							throw new SecurityException();
						}
						Method[] var14 = method2560(var6).getDeclaredMethods();
						Method[] var15 = var14;
						for (int var16 = 0; var16 < var15.length; ++var16) {
							Method var17 = var15[var16];
							if (var17.getName().equals(var7)) {
								Class[] var18 = var17.getParameterTypes();
								if (var18.length == var27.length) {
									boolean var19 = true;
									for (int var20 = 0; var20 < var27.length; ++var20) {
										if (var27[var20] != var18[var20]) {
											var19 = false;
											break;
										}
									}
									if (var19 && var28 == var17.getReturnType()) {
										var3.field2932[var4] = var17;
									}
								}
							}
						}
						var3.field2928[var4] = var11;
					}
				} else {
					var6 = var0.method1104();
					var7 = var0.method1104();
					var8 = 0;
					if (var5 == 1) {
						var8 = var0.method1100();
					}
					var3.field2934[var4] = var5;
					var3.field2931[var4] = var8;
					if (method2560(var6).getClassLoader() == null) {
						throw new SecurityException();
					}
					var3.field2933[var4] = method2560(var6).getDeclaredField(var7);
				}
			} catch (ClassNotFoundException var21) {
				var3.field2929[var4] = -1;
			} catch (SecurityException var22) {
				var3.field2929[var4] = -2;
			} catch (NullPointerException var23) {
				var3.field2929[var4] = -3;
			} catch (Exception var24) {
				var3.field2929[var4] = -4;
			} catch (Throwable var25) {
				var3.field2929[var4] = -5;
			}
		}
		field4167.method1579(var3);
	}

	static Class method2560(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Class.forName(var0);
		}
	}
}
