package 기말고사.ch07.test07.coffee;

public class Coffee <T> {
    public T name;
    public Coffee(T name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("coffee is ready : " + name);
    }
}
