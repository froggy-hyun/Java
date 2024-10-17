package task02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Chap03_prac18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] studentIds = new int[10];
        int[] scores = new int[10];

        System.out.println("10명 학생의 학번과 점수 입력");
        for (int i = 0; i < 10; i++) {
            try {
                System.out.print((i + 1) + ">>");
                studentIds[i] = scanner.nextInt();
                scores[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("경고!! 정수를 입력하세요.");
                scanner.next();
                i--;
            }
        }

        while (true) {

            System.out.print("학번으로 검색: 1, 점수로 검색: 2, 끝내려면 3>>");
            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (choice) {
                case 1: // 학번으로 검색
                    while (true) {
                        try {
                            System.out.print("학번>>");
                            int searchId = scanner.nextInt();
                            boolean found = false;
                            for (int i = 0; i < 10; i++) {
                                if (studentIds[i] == searchId) {
                                    System.out.println(scores[i] + "점");
                                    found = true;
                                }
                            }
                            if (!found) {
                                System.out.println(searchId + "의 학생은 없습니다.");
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("경고!! 정수를 입력하세요.");
                            scanner.next();
                        }
                    }
                    break;

                case 2: // 점수로 검색
                    while (true) {
                        try {
                            System.out.print("점수>>");
                            boolean found = false;
                            int searchScore = scanner.nextInt();
                            found = false;
                            System.out.print("점수가 " + searchScore + "인 학생은 ");
                            for (int i = 0; i < 10; i++) {
                                if (scores[i] == searchScore) {
                                    System.out.print(studentIds[i] + " ");
                                    found = true;
                                }
                            }
                            if (found) {
                                System.out.println("입니다.");
                            } else {
                                System.out.println("없습니다.");
                            }
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("경고!! 정수를 입력하세요.");
                            scanner.next();
                        }
                    }
                    break;

                default:
                    System.out.println("잘못된 선택입니다. 다시 입력하세요.");
                    break;
            }
        }

        scanner.close();
    }
}
