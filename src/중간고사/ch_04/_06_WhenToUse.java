package 중간고사.ch_04;

public class _06_WhenToUse {
    public static int getPower(int num){   // num : Parameter : 매개변수
        return getPower(num, 2);
    }

    public static int getPower(int num, int exp){
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result);

        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result);

        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result);
        System.out.println(getPower(10, 3));
        System.out.println(getPower(3));
    }
}
