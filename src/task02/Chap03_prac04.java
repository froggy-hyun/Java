package task02;

public class Chap03_prac04 {

    public static void main(String[] args) {
        int n[][] = {{1, 2, 3}, {1, 2}, {1}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}