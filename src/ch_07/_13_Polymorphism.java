package ch_07;

import ch_07.camera.Camera;
import ch_07.camera.FactoryCam;
import ch_07.camera.SpeedCam;
import com.sun.xml.internal.ws.addressing.WsaActionUtil;

//class Person
//class Teacher extends Person
//class Student extends Person
public class _13_Polymorphism { // IS-A relationship
    public static void main(String[] args) {
//        Camera camera = new Camera();
//        FactoryCam factoryCam = new FactoryCam();
//        SpeedCam speedCam = new SpeedCam();

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera c : cameras) {
            c.showMainFeature();
        }

        // error
//        factoryCam.detectFire();
//        speedCam.checkSpeed();
//        speedCam.recognizeLicensePlate();

        if (camera instanceof FactoryCam){
            System.out.println("This is a CAM");
        }
        if (camera instanceof FactoryCam){
            ((FactoryCam)factoryCam).detectFire();
        }
        if (camera instanceof SpeedCam){
            ((SpeedCam)speedCam).checkSpeed();
            ((SpeedCam)speedCam).recognizeLicensePlate();
        }

        // default class object
        Object[] objs = new Object[3];
        objs[0] = camera;
        objs[1] = factoryCam;
        objs[2] = speedCam;
    }
}
