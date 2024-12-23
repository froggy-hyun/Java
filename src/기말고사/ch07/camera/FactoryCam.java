package 기말고사.ch07.camera;

//IS-A relationship
public class FactoryCam extends Camera { // Child Class
//    public String name;

    public FactoryCam() {
//        this.name = "CAN_FACTORY";
        super("CAN_FACTORY");
    }
//    public void takePicture() {
//        System.out.println("Taking picture");
//    }
//    public void recordVideo(){
//        System.out.println("Recording video");
//    }

    public void recordVideo(){
        super.recordVideo();
        detectFire();
    }

    public void detectFire(){
        System.out.println("Detect fire");
    }

    public void showMainFeature(){
        System.out.println(this.name + "'s main feature is detecting the fire");
    }
}
