package 중간고사.ch_04;

public class _07_VariableScope {
    public static void main(String[] args) {
        int number = 3;
//        System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println(number);
        }
//        System.out.println(i);
    }
}
