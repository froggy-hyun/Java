package 중간고사.ch_07;

import 중간고사.ch_07.camera.Camera;

public class _15_Reference {
    public static void main(String[] args) {
        int[] i = new int[10];
        System.out.println(i[0]);

        double[] d = new double[10];
        System.out.println(d[0]);

        //reference type
        String[] s = new String[10];
        System.out.println(s[0]);

        Camera[] c  = new Camera[10];
        System.out.println(c[0]);

        int a = 10;
        int b = 20;
        b=a;
        System.out.println(a);
        System.out.println(b);

        b = 30;
        System.out.println(a);
        System.out.println(b);

        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "A1";
        c2.name = "B1";
        System.out.println(c1.name);
        System.out.println(c2.name);
        c1 = c2;
        System.out.println(c1.name);
        System.out.println(c2.name);

        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);
    }

    public static void changeName(Camera camera){
        camera.name = "wrong camera";
    }
}
