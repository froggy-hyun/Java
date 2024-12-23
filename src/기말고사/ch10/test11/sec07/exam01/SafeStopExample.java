package 기말고사.ch10.test11.sec07.exam01;

public class SafeStopExample {
	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		printThread.setStop(true);
	}
}