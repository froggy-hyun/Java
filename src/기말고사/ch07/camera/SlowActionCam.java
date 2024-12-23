package 기말고사.ch07.camera;

public class SlowActionCam extends ActionCam {
    public SlowActionCam() {
        this.name = "SLOW-CAN-ACTION";
    }

    public void makeVideo(){
        System.out.println(this.name + " is making video with " + this.lens);
    }
}
