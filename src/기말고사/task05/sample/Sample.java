package 기말고사.task05.sample;

class SuperObject {
    public void paint() {
        draw();
    }

    public void draw() {
        System.out.println("Super Object");
    }
}

class SubObject extends SuperObject {
    @Override
    public void paint() {
        super.draw();
    }

    @Override
    public void draw() {
        System.out.println("Sub Object");
    }
}

public class Sample {
    public static void main(String[] args) {
        SuperObject b = new SubObject();
        b.paint();

        SuperObject c = new SuperObject();
        c.paint();
    }
}