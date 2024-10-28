package 중간고사.task02;

public class Chap03_prac02_4 {

    public static void main(String[] args) {
        int n[] = {1, -2, 6, 20, 5, 72, -16, 256};

        int i = 0;
        do {
            if (n[i] > 0 && n[i] % 4 == 0) {
                System.out.println(n[i] + " ");
            }
            i++;
        }
        while (i < n.length);
    }
}
