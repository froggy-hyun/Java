package 중간고사.ch_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "최성현";
        int hour;
        hour = 15;
        System.out.println(name + "님 " + "배송이 시작됩니다. " + hour + "시 방문예정입니다");
        System.out.println(name + "님 " + "배송이 완료되었습니다.");

        double score;
        score = 90.5;
        char grade;
        grade = 'A';
        System.out.println(name + "의 점수는 " + score + "입니다.");
        System.out.println("성적은 " + grade + "입니다");

        boolean pass = true;
        System.out.println("이번 시험에 합격했나요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789f;
        System.out.println(d);
        System.out.println(f);

        //int i = 100000000000;
        //System.out.println(i);

        long l = 100_000_000_000l;
        System.out.println(l);

    }
}
