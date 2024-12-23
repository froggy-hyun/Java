package 중간고사.task02;

public class Chap03_prac07 {

    public static void main(String[] args) {
        int rand_int_arr [] = new int [10];

        for(int i=0; i<rand_int_arr.length; i++) {
            rand_int_arr[i] = (int)(Math.random()*9) + 11;// 11~19까지의 랜덤한 정수 발생
        }

        int sum = 0;
        System.out.print("랜덤한 정수들...");
        for(int i=0; i<rand_int_arr.length; i++) {
            System.out.print(rand_int_arr[i] + " ");
            sum += rand_int_arr[i];
        }

        System.out.println();
        System.out.println("평균은 " + (double)sum/rand_int_arr.length);
    }
}
