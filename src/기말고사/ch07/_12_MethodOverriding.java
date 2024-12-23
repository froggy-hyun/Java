package 기말고사.ch07;

import 기말고사.ch07.camera.Camera;
import 기말고사.ch07.camera.FactoryCam;
import 기말고사.ch07.camera.SpeedCam;

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
