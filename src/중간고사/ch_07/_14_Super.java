package 중간고사.ch_07;

import 중간고사.ch_07.camera.FactoryCam;
import 중간고사.ch_07.camera.SpeedCam;

public class _14_Super {
    public static void main(String[] args) {
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}
