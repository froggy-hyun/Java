package 기말고사.ch08;

import java.util.Scanner;

public class _04_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Name : ");
        String name = sc.next();
        System.out.println("Name : " + name);
        System.out.println("=============================");

        System.out.println("Enter a Age : ");
        int age = sc.nextInt();
        System.out.println("Age : " + age);
        System.out.println("=============================");
        sc.nextLine();

        System.out.println("How's your feels? : ");
        String feeling = sc.next();
        System.out.println("Feeling is : " + feeling);
        System.out.println("=============================");


    }
}
