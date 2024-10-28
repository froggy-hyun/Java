package 중간고사.ch_07;

public class _04_OverLoading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "A1";

        b1.record(false, false, 5);
        b1.record(true, false, 5);
        b1.record(true, true, 10);

        b1.record();
    }
}
