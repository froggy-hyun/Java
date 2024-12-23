package 기말고사.ch07.test07;

import 기말고사.ch07.test07.coffee.CoffeeByUser;
import 기말고사.ch07.test07.user.User;
import 기말고사.ch07.test07.user.VIPUser;

public class _02_GenericClass04 {
    public static void main(String[] args) {
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("Kim"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("Seo"));
        c8.ready();

        System.out.println("===================================");
        orderCoffee("Elise");
        orderCoffee(36);

        System.out.println("===================================");
        orderCoffee("LEE", "Americano");
        orderCoffee(37, "Americano");

    }
    public static <T> void orderCoffee(T name) {
        System.out.println("coffee is ready : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + "coffee is ready : " + name);
    }
}
