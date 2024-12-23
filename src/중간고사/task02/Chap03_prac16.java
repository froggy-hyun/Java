package 중간고사.task02;

import java.util.Scanner;

public class Chap03_prac16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;
        int sum = 0;
        int count = 0;

        System.out.print("양의 정수를 입력하세요. -1은 입력 끝>>");
        while (true) {
            input = scanner.next();

            if (input.equals("-1")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);

                if (number > 0) {
                    sum += number;
                    count++;
                } else {
                    System.out.println(number + " 제외");
                }
            } catch (NumberFormatException e) {
                System.out.println(input + " 제외");
            }
        }

        double average = (double) sum / count;
        System.out.println("평균은 " + (int) average);

        scanner.close();
    }
}
