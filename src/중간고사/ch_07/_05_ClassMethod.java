package 중간고사.ch_07;

public class _05_ClassMethod {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "A1";

        b1.callServiceCenter();
        BlackBox.callServiceCenter();
    }
}
