package 중간고사.task02;

import java.util.Scanner;

public class Chap02_prac08_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        String op;
        while (true) {
            System.out.print("연산 입력>>");

            num1 = scanner.nextDouble();
            op = scanner.next();
            num2 = scanner.nextDouble();

            if (op.equals("더하기") || op.equals("빼기") || op.equals("곱하기") || op.equals("나누기")) {
                if (op.equals("나누기") && (num2 == 0)) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    break;
                } 
            } else{
                System.out.println("사칙연산이 아닙니다.");
            }
        }

        double result;
        
        if (op.equals("더하기")) {
            result = num1 + num2;
        } else if (op.equals("빼기")) {
            result = num1 - num2;
        } else if (op.equals("곱하기")) {
            result = num1 * num2;
        } else {
            result = num1 / num2;
        }

        System.out.println(num1 + " " + op + " " + num2 + "의 계산 결과는 " + result);
        
        scanner.close();
    }
}
