package 중간고사.ch_07;

public class _08_GetterAndSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "A1";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "red";

        b1.price = -5000;
        System.out.println("Price : " + b1.price + "원입입니다.");

        BlackBox b2 = new BlackBox();
        b2.setModelName("A2");
        b2.setPrice(-5000);
        b2.setColor("red");

        System.out.println(b2.getPrice());
        System.out.println(b2.getColor());


    }
}
