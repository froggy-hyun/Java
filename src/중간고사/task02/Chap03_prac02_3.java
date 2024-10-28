package 중간고사.task02;

public class Chap03_prac02_3 {

    public static void main(String[] args) {
        int n[] = {1, -2, 6, 20, 5, 72, -16, 256};

        int i = 0;
        while (i < n.length) {
            if (n[i] > 0 && n[i] % 4 == 0) {
                System.out.println(n[i] + " ");
            }
            i++;
        }
    }
}
