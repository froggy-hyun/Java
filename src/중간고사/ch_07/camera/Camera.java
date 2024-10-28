package 중간고사.ch_07.camera;

public class Camera { // Parent Class
    public String name;

    public Camera() {
//        this.name = "CAN_ON";
        this("CAN_ON");
    }

    protected Camera(String name) {
        this.name = name;
    }

    public void takePicture() {
        System.out.println(this.name + " Taking picture");
    }
    public void recordVideo(){
        System.out.println(this.name + " Recording video");
    }

    public void showMainFeature(){
        System.out.println(this.name + "'s main feature is taking picture and recording video");
    }
}
