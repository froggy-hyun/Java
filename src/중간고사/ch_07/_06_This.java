package 중간고사.ch_07;

public class _06_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "A1";

        b1.appendModelName("(최신형)");
        System.out.println(b1.modelName);

    }

}
