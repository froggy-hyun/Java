package 중간고사.ch_07;

import 중간고사.ch_07.camera.Camera;
import 중간고사.ch_07.camera.FactoryCam;
import 중간고사.ch_07.camera.SpeedCam;

public class _11_Inheritance {
    public static void main(String[] args) {
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}
