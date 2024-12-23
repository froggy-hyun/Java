package 중간고사.ch_04;

public class _02_Parameter {
    public static void power(int num){   // num : Parameter : 매개변수
        int result = num * num;
        System.out.println("power 메소드의 결과는 " + result);
    }
    public static void powerByExp(int num, int exp){
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        System.out.println("powerByExp 메소드의 결과는 " + result);
    }
    public static void main(String[] args) {
        // 10 : Argument : 인수
        power(10);
        powerByExp(2, 3);

    }
}
