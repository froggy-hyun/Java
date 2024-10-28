package 중간고사.ch_07.camera;

public class SlowActionCam extends ActionCam {
    public SlowActionCam() {
        this.name = "SLOW-CAN-ACTION";
    }

    public void makeVideo(){
        System.out.println(this.name + " is making video with " + this.lens);
    }
}
