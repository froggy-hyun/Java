package 중간고사.task02;

import java.util.Scanner;

public class Chap02_prac06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;

        while (true) {
            System.out.print("나이를 입력하세요>>");
            age = scanner.nextInt();

            if (age >= 1) {
                break;
            } else {
                System.out.println("나이는 양수로만 입력하세요.");
            }
        }

        int red, blue, yellow;
        red = age/10;
        blue = (age%10)/5;
        yellow = ((age%10)%5);

        System.out.println("빨간 초 " + red + "개, 파란 초 " + blue + "개, 노란 초 "
                + yellow + "개. 총 " + (red+blue+yellow) + "개가 필요합니다.");

        scanner.close();
    }
}
