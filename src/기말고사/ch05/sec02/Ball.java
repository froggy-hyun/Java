package 기말고사.ch05.sec02;

public class Ball extends Circle{
    String color;

    Ball() {
        super(10);
        this.color = "red";
    }

    Ball(double radius) {
        super(radius);
        this.color = "red";
    }

    Ball(double radius, String color) {
        super(radius);
        this.color = color;
    }

    @Override
    void findArea(){
        System.out.println("넓이는" + 4*PI*radius*radius + "이다.");
    }

    void findColor() {
        System.out.println(color + "색 공이다.");
    }

    void findVolume() {
        System.out.println("부피는" + 4/3*PI*radius*radius*radius + "이다.");
    }
}
