package 기말고사.ch07.test07.coffee;


import 기말고사.ch07.test07.user.User;

public class CoffeeByUser <T extends User> {
    public T user;
    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("coffee is ready : " + user.name);
        user.addPoint();
    }
}
