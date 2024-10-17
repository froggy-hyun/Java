package ch_07;

import ch_07.camera.Camera;
import ch_07.camera.FactoryCam;
import ch_07.camera.SpeedCam;

public class _12_MethodOverriding {
    public static void main(String[] args) {
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

    }
}
