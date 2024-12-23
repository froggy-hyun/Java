package 중간고사.ch_04;

import java.util.Arrays;

public class _03_Return {
    public static void powerByExp(int num, int exp){
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        System.out.println("powerByExp 메소드의 결과는 " + result);
    }
    public static String hotelInfo(){
        //전화번호
        String phoneNum = "010-1234-5678";
        // 주소
        String address = "서울 마포구";
        // 액티비티
        String activity = "Due";
        return phoneNum;
    }

    public static String[] hotelInfo2(){
        //전화번호
        String phoneNum = "010-1234-5678";
        // 주소
        String address = "서울 마포구";
        // 액티비티
        String activity = "Due";

        String[] array1 = new String[3];
        array1[0] = phoneNum;
        array1[1] = address;
        array1[2] = activity;

        return array1;
    }

    public static void main(String[] args) {
        powerByExp(5, 3);

        String contactNum = hotelInfo();
        System.out.println(contactNum);

        String getArray = Arrays.toString(hotelInfo2());
        System.out.println("Array values: " + getArray);
        System.out.println();
    }
}
