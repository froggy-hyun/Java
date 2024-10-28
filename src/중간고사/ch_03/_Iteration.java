package 중간고사.ch_03;

public class _Iteration {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }

        String[] s = new String[4];
        s[0] = "1";
        s[1] = "2";
        s[2] = "3";
        s[3] = "4";

        for (String str : s) {
            System.out.println(str);
        }
    }
}
