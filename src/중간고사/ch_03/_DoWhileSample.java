package 중간고사.ch_03;

public class _DoWhileSample {
    public static void main(String[] args) {
        char c = 'a';
        do {
            System.out.print(c);
            c = (char) (c + 1);
        } while (c <= 'z');
    }
}
