package 기말고사.ch05;

public class _01_Array {
    public static void main(String[] args) {
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "카페라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeChandler + " 하나");
        System.out.println(coffeeMonica + " 하나");
        System.out.println("주세요");

        String[] coffeeOrders = new String[4];      // 첫번쨰 방법
        //String coffeeOrders[] = new String[4];    // 두번쨰 방법

        coffeeOrders[0] = "아메리카노";
        coffeeOrders[1] = "카페모카";
        coffeeOrders[2] = "카페라떼";
        coffeeOrders[3] = "카푸치노";
        System.out.println();

        //String coffeeOrders[] = new String[] {"아메리카노", "카페모카", "카페라떼", "카푸치노"};    // 세번쨰 방법
        //String coffeeOrders[] = {"아메리카노", "카페모카", "카페라떼", "카푸치노"};    // 네번쨰 방법

        System.out.println(coffeeOrders[0] + " 하나");
        System.out.println();

        //coffeeOrders[2] = "에스프레소";
        for (int i = 0; i <4 ; i++) {
            System.out.println(coffeeOrders[i] + " 하나");

        }
        System.out.println("주세요");
        System.out.println();

        int[] i = new int[4];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        i[3] = 4;
        System.out.println(i[0]);

        boolean[] b = new boolean[4];
        double[] d = new double[4];
        b[0] = true;
        b[1] = true;
        b[2] = true;
        b[3] = false;
        System.out.println(b[0]);
    }
}
