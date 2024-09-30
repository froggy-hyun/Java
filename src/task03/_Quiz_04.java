package task03;

import java.util.Scanner;

public class _Quiz_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경차 또는 장애인 차량 여부를 입력하세요(y/n): ");
        String car = scanner.nextLine();

        System.out.println("주차시간을 입력하세요: ");
        int time = scanner.nextInt();

        int fee = 4000 * time;
        if (fee > 30000) { // 일일 요금이 30000원을 초과할 수 없음.
            fee = 30000;
        }
        if (car.equals("y")) {
            fee = fee / 2;
        }
        System.out.println("주차요금은 " + fee + "원입니다.");
    }
}