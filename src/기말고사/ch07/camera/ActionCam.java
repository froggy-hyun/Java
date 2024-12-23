package 기말고사.ch07.camera;

public class ActionCam extends Camera {
//    public Final String lens = "WIDE-lens";
    public final String lens;
//    public String lens = "WIDE-lens";

    public ActionCam() {
        super("CAN-ACTION");
        lens = "WIDE-lens";
    }
    public void makeVideo(){
        System.out.println(this.name + " is making video with " + this.lens);
    }
}