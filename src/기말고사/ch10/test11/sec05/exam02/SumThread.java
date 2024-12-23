package 기말고사.ch10.test11.sec05.exam02;

public class SumThread extends Thread {
	private long sum;
	
	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
	}
}