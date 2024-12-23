package 중간고사.task02;

import java.util.Scanner;

public class Chap02_prac04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("여행지>>");
        String destination = scanner.nextLine();

        System.out.print("인원수>>");
        int people = scanner.nextInt();

        System.out.print("숙박일>>");
        int room = scanner.nextInt();

        System.out.print("1인당 항공료>>");
        int airplane_price = scanner.nextInt();

        System.out.print("1방 숙박비>>");
        int room_charge = scanner.nextInt();

        System.out.print(people + "명의 " + destination + " " + room + "박 " + (room+1)
                + "일 여행에는 방이 " + ((people/2)+(people%2)) + "개 필요하며 경비는 "
                + ((airplane_price*people)+(room_charge*((people/2)+(people%2))*room)) + "원입니다.");

    }
}
