package ch_07.camera;

//IS-A relationship
public class SpeedCam extends Camera { // Child Class
//    public String name;

    public SpeedCam() {
//        this.name = "CAN_SPEED";
        super("CAN_SPEED");
    }
//    public void takePicture() {
//        System.out.println("Taking picture");
//    }
//    public void recordVideo(){
//        System.out.println("Recording video");
//    }

    public void takePicture() {
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed(){
        System.out.println("Speed Check");
    }
    public void recognizeLicensePlate(){
        System.out.println("License Plate Check");
    }

    @Override
    public void showMainFeature(){
        System.out.println(this.name + "'s main feature is checking speed and recognize the license plate");
    }
}
