package task02;

public class Chap03_prac02_1 {

    public static void main(String[] args) {
        int n[] = {1, -2, 6, 20, 5, 72, -16, 256};
        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0 && n[i] % 4 == 0) {
                System.out.println(n[i] + " ");
            }
        }
    }
}
