package 기말고사.ch05.sec04;

import 기말고사.ch05.sec03.Computer;
import 기말고사.ch05.sec03.Controllable;
import 기말고사.ch05.sec03.TV;

public class ControllableDemo {
	public static void main(String[] args) {
		Controllable[] controllable = { new TV(), new Computer() };

		for (Controllable c : controllable) {
			c.turnOn();
			c.turnOff();
			c.repair();
		}
		Controllable.reset();
	}
}