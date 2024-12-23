package 기말고사.ch05.sec05;

public class MemberClassDemo {
	private String secret = "secret";
	String s = "MemberClassDemo";

	class MemberClass {
		String s = "MemberClass";

		public void show1() {
			System.out.println("show1");
			System.out.println(secret);

			System.out.println(s);

			System.out.println(MemberClassDemo.this.s);
		}

		// static String s3 = "���� ��� �ʵ�";
		// static void show2() {}
	}

	public static void main(String[] args) {
		MemberClassDemo m = new MemberClassDemo();
		MemberClassDemo.MemberClass m1 = m.new MemberClass();

		System.out.println(m1.s);
		m1.show1();
	}
}