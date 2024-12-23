package 기말고사.ch05.sec05;

class Icon {
	interface Touchable {
		void touch();
	}
}

public class InnerInterfaceDemo implements Icon.Touchable {
	public void touch() {
		System.out.println("�������� ��ġ�Ѵ�.");
	}

	public static void main(String[] args) {
		Icon.Touchable btn = new InnerInterfaceDemo();
		btn.touch();
	}
}