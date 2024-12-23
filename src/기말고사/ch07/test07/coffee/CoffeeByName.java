package 기말고사.ch07.test07.coffee;

public class CoffeeByName {
    public Object name;

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("coffee is ready : " + name);
    }

}
