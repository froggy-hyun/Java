package 중간고사.ch_02;

import java.util.Scanner;

public class _11_MultipleOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("수를 입력하시오: ");
        int number = in.nextInt();

        if (number % 3 == 0)
            System.out.println("3의배수입니다.");
        else
            System.out.println("3의배수가아닙니다.");

        in.close();
    }
}
