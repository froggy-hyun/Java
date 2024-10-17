package task02;

import java.util.Scanner;

public class Chap03_prac08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 몇 개 저장하시겠습니까>>");

        int n = scanner.nextInt();

        int rand_int_arr[] = new int[n];

        for (int i = 0; i < rand_int_arr.length; i++) {
            rand_int_arr[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.print("랜덤한 정수들...");

        int sum = 0;
        for (int j = 0; j < rand_int_arr.length; j++) {
            System.out.print(rand_int_arr[j] + " ");
            sum += rand_int_arr[j];
        }
        System.out.println("");
        System.out.print("평균은 " + (double) sum / rand_int_arr.length);
    }
}
