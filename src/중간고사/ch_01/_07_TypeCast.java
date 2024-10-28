package 중간고사.ch_01;

public class _07_TypeCast {
    public static void main(String[] args) {
        int score = 93;
        System.out.println(score);
        System.out.println((float)score);
        System.out.println((double)score);

        float score_f = 93.3f;
        double score_d = 98.8d;
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        // int > long > float > double (자동 형변환)
        // double > float > long > int (수동 형변환)
        //score = 93 + 98.8; // 오류
        score = 93 + (int)98.8;
        score_d = (double)93 + 98.8;
        //score_f = (float)93 + 98.8; //오류 : default double 형
        System.out.println(score_f);

        //숫자를 문자열로 변환
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);

        //int error = Integer.parseInt("자바"); // 오류
    }
}
