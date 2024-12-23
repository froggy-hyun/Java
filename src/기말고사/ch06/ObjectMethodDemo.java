package 기말고사.ch06;

class Mouse {
    String name;

    public Mouse(String name) {
        this.name = name;
    }
}

class Keyboard {
    String name;

    public Keyboard(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Keyboard) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "keyboard";
    }
}

public class ObjectMethodDemo {
    public static void main(String[] args) {
        Mouse m1 = new Mouse("Logitech");
        Mouse m2 = new Mouse("Logitech");
        Mouse m3 = m1;
        Keyboard k1 = new Keyboard("Microsoft");
        Keyboard k2 = new Keyboard("Microsoft");

        System.out.println(m1.toString());
        System.out.println(m1);

        System.out.println(k1.toString());
        System.out.println(k1);

        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m3));
        System.out.println(k1.equals(k2));
    }
}
