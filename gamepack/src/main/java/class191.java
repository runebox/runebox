import java.util.concurrent.ThreadFactory;

final class class191 implements ThreadFactory {

	@Override
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}
}
