package 중간고사.ch_07;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;
    int serialNumber;

    static boolean canAutoReport = false;
    static int count = 0;

    BlackBox() {
//        System.out.println("기본생성자 호출");
//        this.serialNumber = ++count;
//        System.out.println("New SerialNumber: " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this();
//
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    void autoReport(){
        if (canAutoReport == true){
            System.out.println("충돌이 감지되어 자동리포트");
        } else {
            System.out.println("자동리포트 기능없음");
        }
    }

    void insertMemoryCard(int capacity){
        System.out.println("메모리카드 삽입\n" + "용량은 " + capacity +"GByte 입니다");
    }

    int getImageFile(int type){
        if (type == 1){
            return 4;

        } else if (type == 2){
            return 5;
        }
        else {
            return 10;
        }
    }

    void record(boolean showDateTime, boolean showSpeed, int min){
        System.out.println("Start Recording");
        if (showDateTime){
            System.out.println("Show DateTime");
        }
        if(showSpeed){
            System.out.println("Show Recording Speed");
        }
        System.out.println("Show recording time as " + min + " min unit");
    }
    void record(){
        System.out.println("Start Recording");
        System.out.println("Show DateTime");
        System.out.println("Show Recording Speed");
        System.out.println("Show recording time as " + 5 + " min unit");

        record(true, true, 10);
    }

    static void callServiceCenter(){
        System.out.println("서비스 센터 1588-0000으로 연결합니다.");

        //modelName = 'T1'; // 인스턴스 변수는 클래스 메소스에서 접근불가.
        canAutoReport = true; // 클래스 변수에는 클래스 메소드에서 접근가능하다.
    }

    void appendModelName(String modelName) {
        //modelName += modelName;
        this.modelName += modelName;

    }

    String getModelName(){
        return modelName;
    }

    void setModelName(String modelName){
        this.modelName = modelName;
    }

    String getResolution(){
        if (resolution == null || resolution.isEmpty()){
            return "Please ask administrator";
        }
        return resolution;
    }

    void setResolution(String resolution){
        this.resolution = resolution;
    }
    int getPrice(){
        return price;
    }

    void setPrice(int price){
        if (price < 100000){
            this.price = 100000;
        } else{
            this.price = price;
        }
    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color = color;
    }
}
