package 중간고사.task02;

import java.util.Scanner;

public class Chap02_prac10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("(x1, y1), (x2, y2)의 좌표 입력>>");
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if ((x1 > 10 && x1 < 200) && (x2 > 10 && x2 < 200)
                && (y1 > 10 && y1 < 300) && (y2 > 10 && y2 < 300)) // 점이 사각형 안에 있는 경우
            System.out.println("(" + x1 + "," + y1 + ") "+ "(" + x2 + "," + y2 + ") "
                    + "사각형은 (10,10) (200,300) 사각형 안에 포함된다.");
        else
            System.out.println("(" + x1 + "," + y1 + ") "+ "(" + x2 + "," + y2 + ") "
                    + "사각형은 (10,10) (200,300) 사각형 안에 포함되지 않는다.");
        scanner.close();
    }
}
