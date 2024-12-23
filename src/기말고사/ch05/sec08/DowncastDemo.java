package 기말고사.ch05.sec08;

class Person {
    String name = "사람";

    void whoami() {
        System.out.println("난 사람이다.");
    }
}

class Student extends Person {
    int number = 7;

    void work() {
        System.out.println("나는 공부한다.");
    }
}

public class DowncastDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Person p = s1;
        Student s2 = (Student) p;
    }
}
