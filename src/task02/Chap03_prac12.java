package task02;

import java.util.Scanner;

public class Chap03_prac12 {

    public static void main(String[] args) {

        System.out.println("***** 작명 프로그램이 실행됩니다. *****");
        Scanner scanner = new Scanner(System.in);

        String[] boyMiddleList = {"기", "민", "용", "종", "현", "진", "재", "승", "소", "상", "지"};
        String[] boyLastList = {"태", "진", "광", "혁", "우", "철", "빈", "준", "구", "호", "석"};

        String[] girlMiddleList = {"은", "원", "경", "수", "현", "예", "여", "송", "서", "채", "하"};
        String[] girlLastList = {"진", "연", "경", "서", "리", "숙", "미", "원", "린", "희", "수"};
        
        while(true) {
            System.out.print("남/여 선택>>");
            String gender = scanner.next();

            if (gender.equals("그만")) {
                break;
            }

            if (gender.equals("남")) {
                int middle_index = (int) (Math.random() * boyMiddleList.length);
                int last_index = (int) (Math.random() * boyMiddleList.length);
                System.out.print("성 입력>>");
                String lastname = scanner.next();
                System.out.println("추천이름: " + lastname + boyMiddleList[middle_index] + boyLastList[last_index]);

            } else if (gender.equals("여")) {
                int middle_index = (int) (Math.random() * girlMiddleList.length);
                int last_index = (int) (Math.random() * girlMiddleList.length);
                System.out.print("성 입력>>");
                String lastname = scanner.next();
                System.out.println("추천이름: " + lastname + girlMiddleList[middle_index] + girlLastList[last_index]);

            } else {
                System.out.println("남/여/그만 중에서 입력하세요!");
            }

            
        }
        scanner.close();
    }
}
