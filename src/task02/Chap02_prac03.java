package task02;

import java.util.Scanner;

public class Chap02_prac03 {

    public static final int tteokbokki = 2000; // 떡볶이
    public static final int gimmari = 1000;  // 김말이
    public static final int jjolmyeon = 3000; // 쫄면

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** 자바 분식입니다. 주문하면 금액을 알려드립니다.****");
        System.out.print("떡볶이 몇 인분>>");
        int choice1 = scanner.nextInt();

        System.out.print("김말이 몇 인분>>");
        int choice2 = scanner.nextInt();

        System.out.print("쫄면 몇 인분>>");
        int choice3 = scanner.nextInt();

        int price = choice1*tteokbokki + choice2*gimmari + choice3*jjolmyeon;
        System.out.println("전체 금액은 " + price + "원입니다.");

        scanner.close();
    }
}
