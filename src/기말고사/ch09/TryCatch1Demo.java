package 기말고사.ch09;

public class TryCatch1Demo {
    public static void main(String[] args) {
        int[] array = {0, 1, 2};
        try {
            System.out.println(array[3]);
            System.out.println(array[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("범위 초과");
        }
        System.out.println("!!");
    }
}
