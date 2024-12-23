package 기말고사.ch05.task05.classCastEx;

class A {
    int i;
    int j;
}

class B extends A {
    int k;
    int l;
}

public class ClassCastEx {
    public static void main(String[] args) {
        A a = new B();
        B b = (B)a;
//        if (a instanceof b)
        if (a instanceof B)
            System.out.print("GO");
        if (b instanceof A)
            System.out.print("STOP");
    }
}






