package 중간고사.ch_04;

public class _04_ParameterAndReturn {
    public static int getPower(int num){   // num : Parameter : 매개변수
        int result = num * num;
        System.out.println("power 메소드의 결과는 " + result);
        return result;
    }

    public static int getPowerByExp(int num, int exp){
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        System.out.println("powerByExp 메소드의 결과는 " + result);
        return result;
    }

    public static void main(String[] args) {
        int retVal = getPower(2);
        System.out.println(retVal);
        int retValByExp = getPowerByExp(2, 3);
        System.out.println(retValByExp);
    }
}
