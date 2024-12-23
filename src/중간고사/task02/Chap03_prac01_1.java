package 중간고사.task02;

public class Chap03_prac01_1 {

    public static void main(String[] args) {
        int sum=0, i=1;
        while (true) {
            if(i > 50)
                break;
            sum = sum + i;
            i += 3;
        }
        System.out.println(sum);
    }
}
