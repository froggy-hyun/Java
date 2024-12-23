package 중간고사.task03;


public class _Quiz_05 {
    public static void main(String[] args) {
        int[] stock = new int[10];
        int size = 250;
        for (int i = 0; i < 10; i++) {
            stock[i] = size;
            size = size + 5;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("사이즈 : " + stock[i] + " (재고있음)" );
        }
    }
}
