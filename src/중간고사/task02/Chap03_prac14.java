package 중간고사.task02;

import java.util.Scanner;

public class Chap03_prac14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("***** 갬블링 게임을 시작합니다. *****");

        while(true) {
            System.out.print("엔터키 입력>>");
            String select = scanner.nextLine();
            int rand_int1 = (int) (Math.random() * 2);
            int rand_int2 = (int) (Math.random() * 2);
            int rand_int3 = (int) (Math.random() * 2);
            System.out.println(rand_int1 + " " + rand_int2 + " " +  rand_int3 + " ");
            if (rand_int1 == rand_int2 && rand_int2 == rand_int3
                    && rand_int3 == rand_int1) {
                System.out.println("성공1 대박났어요!");
                System.out.println("계속하시겠습니까?(yes/no>>");
                String choice = scanner.nextLine();
                if (choice.equals("no")) {
                    break;
                }

            }

        }
        scanner.close();
    }
}
