package 기말고사.ch05.sec03;

public class TV implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("TV�� �Ҵ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ����.");
	}
}