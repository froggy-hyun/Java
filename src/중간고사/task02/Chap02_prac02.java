package 중간고사.task02;

import java.util.Scanner;

public class Chap02_prac02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("생일 입력 하세요>>");
        int birthday = scanner.nextInt();
        System.out.print(birthday/10000 + "년 " + birthday/100%100 + "월 " + birthday%100 + "일");
    }

}
