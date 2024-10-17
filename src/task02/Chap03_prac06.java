package task02;

import java.util.Scanner;

public class Chap03_prac06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n[] = new int [10];

        System.out.print("양의 정수 10개 입력>>");
        for(int i=0; i<n.length; i++) {
            n[i] = scanner.nextInt();
        }

        int count = 0;
        System.out.print("자리수의 합의 9인 것은...");
        for(int i=0; i<n.length; i++) {
            int sum = 0;
            int temp = n[i];
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if(sum == 9) {
                System.out.print(n[i] + " ");
                count++;
            }
        }
        if(count == 0)
            System.out.println("없습니다.");
        else
            System.out.println();

        scanner.close();
    }
}
