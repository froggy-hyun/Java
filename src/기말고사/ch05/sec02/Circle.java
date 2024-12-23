package 기말고사.ch05.sec02;

public class Circle {
    double radius;
    static final double PI = 3.141592;

    Circle() {
        this.radius = 10;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    void findRadius() {
        System.out.println("반지름이 " + radius + "센티이다.");

    }
    void findArea() {
        System.out.println("넓이는" + PI*radius*radius + "이다.");
    }
}
