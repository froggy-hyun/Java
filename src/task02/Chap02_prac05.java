package task02;

import java.util.Scanner;

public class Chap02_prac05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생1>>");
        String name1 = scanner.next();
        int lateCount1 =  scanner.nextInt();
        int absentCount1 =  scanner.nextInt();
        int deductionScore1 = lateCount1*3 + absentCount1*8;
        int attendanceScore1 = 100 - deductionScore1;

        System.out.print("학생2>>");
        String name2 = scanner.next();
        int lateCount2 =  scanner.nextInt();
        int absentCount2 =  scanner.nextInt();
        int deductionScore2 = lateCount2*3 + absentCount2*8;
        int attendanceScore2 = 100 - deductionScore2;

        System.out.print(name1 + "의 감점은 "  + deductionScore1 + ", ");
        System.out.println(name2 + "의 감점은 "  + deductionScore2);

        if(attendanceScore1 == attendanceScore2)
            System.out.println("점수 동일");
        else if(attendanceScore1 > attendanceScore2)
            System.out.println(name1 + "의 출석 점수가 더 높음. " + name1 + " 출석 점수는 "  + attendanceScore1);
        else
            System.out.println(name2 + "의 출석 점수가 더 높음. " + name2 + " 출석 점수는 "  + attendanceScore2);

        scanner.close();
    }
}
