package 기말고사.ch05;

public class _05_ASCII {
    public static void main(String[] args) {
        // google ASCII Code 검색 (https://ko.wikipedia.org/wiki/ASCII)
        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);

        c = 'a';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);
        System.out.println();

        String[][] seats3 = new String[10][15];
        char ch ='A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        seats3[7][8] = "--";
        seats3[3][7] = "--";
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
