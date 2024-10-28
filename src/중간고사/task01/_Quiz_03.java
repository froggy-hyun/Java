package 중간고사.task01;

import java.util.Scanner;

public class _Quiz_03 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("주민등록번호를 입력하시오: ");
        String id = scanner.next();
        System.out.println(id.substring(0,8));
    }
}
