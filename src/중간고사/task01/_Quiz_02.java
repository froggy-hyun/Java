package 중간고사.task01;

import java.util.Scanner;

public class _Quiz_02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("키를 입력하시오: ");
        int height = scanner.nextInt();
        System.out.println("키가 " + height + " cm 이므로 탑승 " + ((height >= 120) ? "가능" : "불가능") + "합니다");
    }
}
