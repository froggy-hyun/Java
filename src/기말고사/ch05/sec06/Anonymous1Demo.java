package 기말고사.ch05.sec06;

public class Anonymous1Demo {
	Bird e = new Bird() {
		public void move() {
			System.out.println("�������� ����~~~.");
		}

		void sound() {
			System.out.println("����~~~.");
		}
	};

	public static void main(String[] args) {
		Anonymous1Demo a = new Anonymous1Demo();
		a.e.move();
		// a.e.sound();
	}
}