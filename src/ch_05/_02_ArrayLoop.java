package ch_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String coffeeOrders[] = {"아메리카노", "카페모카", "카페라떼", "카푸치노"};    // 네번쨰 방법
        for (int i = 0; i <4 ; i++) {
            System.out.println(coffeeOrders[i] + " 하나");
        }
        System.out.println("주세요");
        System.out.println();

        for (int i = 0; i < coffeeOrders.length; i++) {
            System.out.println(coffeeOrders[i] + " 하나");
        }
        System.out.println("주세요");
        System.out.println();

        // (enhanced for 문) or (for - each 문)
        for (String coffeeOrder : coffeeOrders ){
            System.out.println(coffeeOrder + " 하나");
        }
        System.out.println("주세요");
        System.out.println();
    }
}
