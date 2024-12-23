package 기말고사.ch09;

public class TryCatch3Demo {
    public static void main(String[] args) {
        int[] array = {0, 1, 2};
        try {
            int x = array[3];
        } catch (Exception e) {
            System.out.println("예외발생!!!");
        }
        System.out.println("처리 완료.");
    }
}
