package 기말고사.ch07;

public class _02_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "A1";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "B1";
        System.out.println(b2.modelName);

        System.out.println(b1.modelName + " 자동리포트기능 - " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동리포트기능 - " + b2.canAutoReport);
        System.out.println("모든 모델 자동리포트기능 - "+ BlackBox.canAutoReport);
//        BlackBox.modelName; // 에러 발생

        BlackBox.canAutoReport = true;

        System.out.println(b1.modelName + " 자동리포트기능 - " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동리포트기능 - " + b2.canAutoReport);
        System.out.println("모든 모델 자동리포트기능 - "+ BlackBox.canAutoReport);


    }
}
