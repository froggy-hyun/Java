package 중간고사.task02;

import java.util.Scanner;

public class Chap03_prac10 {

    public static void main(String[] args) {

        int rand_int_arr [][] = new int [4][4];

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<rand_int_arr.length; i++) {
            for(int j=0; j<rand_int_arr[i].length; j++)
                rand_int_arr[i][j] = (int) (Math.random() * 256);
        }

        System.out.println("4x4 배열에 랜덤한 값을 저장한 후 출력합니다.");

        for(int i=0; i<rand_int_arr.length; i++) {
            for(int j=0; j<rand_int_arr[i].length; j++)
                System.out.print(rand_int_arr[i][j] + "\t");
            System.out.println();
        }

        System.out.print("임계값 입력>>");
        int threshold = scanner.nextInt();

        for(int i=0; i<rand_int_arr.length; i++) {
            for (int j = 0; j < rand_int_arr[i].length; j++) {
                if (rand_int_arr[i][j] > threshold) {
                    rand_int_arr[i][j] = 255;
                } else {
                    rand_int_arr[i][j] = 0;
                }
            }
        }

        for(int i=0; i<rand_int_arr.length; i++) {
            for(int j=0; j<rand_int_arr[i].length; j++)
                System.out.print(rand_int_arr[i][j] + "\t");
            System.out.println();
        }

        scanner.close();
    }
}
