package 기말고사.prac06.sec02;

public class InheritanceDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Ball c2 = new Ball();

        System.out.println("원 :");
        c1.findRadius();
        c1.findArea();

        System.out.println("공 :");
        c2.findRadius();
        c2.findColor();
        c2.findArea();
        c2.findVolume();
    }
}
