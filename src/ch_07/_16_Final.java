package ch_07;

import ch_07.camera.ActionCam;
import ch_07.camera.SlowActionCam;

public class _16_Final {
    public static void main(String[] args) {
        ActionCam actionCam = new ActionCam();
//        actionCam.lens = "Standard-Lens";
        actionCam.recordVideo();
        actionCam.makeVideo();

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();

    }
}
