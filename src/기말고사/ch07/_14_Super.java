package 기말고사.ch07;


import 기말고사.ch07.camera.FactoryCam;
import 기말고사.ch07.camera.SpeedCam;

public class _14_Super {
    public static void main(String[] args) {
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}
