package ch_07;

public class _07_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        BlackBox b2 = new BlackBox("B1", "UFD", 300000, "blue");
        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);
        System.out.println(b2.serialNumber);
    }
}
