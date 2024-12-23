package 중간고사.test01;

import java.util.Scanner;

public class _ScannerDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.printf("%d * %d은 %d입니다.\n", x, y, x * y);
    }
}
