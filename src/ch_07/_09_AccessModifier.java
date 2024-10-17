package ch_07;

public class _09_AccessModifier {
    public static void main(String[] args) {
        // private - 해당 클래스에서만 접근가능
        // public - 모든 클래스에서 접근가능
        // default - 같은 패키지 내에서만 접근가능
        // protected - 같은 패키지 접근가능하고, 다른 패키지에서는 상속을 통해 접근 가능
        // encapsulation : 캡슐화
        // information hiding : 정보은닉

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "A1";
        b1.resolution = "FHD";
        b1.setPrice(200000);
        b1.color = "red";

        b1.setPrice(-5000);
        System.out.println("Price : " + b1.getPrice() + "원입입니다.");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("A2");
        b2.setPrice(-5000);
        b2.setColor("red");

        System.out.println(b2.getPrice());
        System.out.println(b2.getColor());
    }
}
