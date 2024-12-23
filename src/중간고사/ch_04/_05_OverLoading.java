package 중간고사.ch_04;

public class _05_OverLoading {
    public static int getPower(int num){   // num : Parameter : 매개변수
        int result = num * num;
        System.out.println("power 메소드의 결과는 " + result);
        return result;
    }

    public static int getPowerStr(String strNum){   // num : Parameter : 매개변수
        int num = Integer.parseInt(strNum);
        int result = num * num;
        System.out.println("power 메소드의 결과는 " + result);
        return result;
    }

    public static int getPower(String strNum){   // num : Parameter : 매개변수
        int num = Integer.parseInt(strNum);
        int result = num * num;
        System.out.println("power 메소드의 결과는 " + result);
        return result;
    }

    public static int getPower(int num, int exp){
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        System.out.println("powerByExp 메소드의 결과는 " + result);
        return result;
    }

    public static void main(String[] args) {
        int retVal = getPowerStr("10");
        System.out.println(retVal);
        System.out.println(getPower(10));
        System.out.println(getPower("10"));
        System.out.println(getPower(10, 3));
    }
}
