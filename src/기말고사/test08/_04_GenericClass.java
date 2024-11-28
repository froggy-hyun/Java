package 기말고사.test08;

import 기말고사.test08.coffee.CoffeeByUser;
import 기말고사.test08.user.User;
import 기말고사.test08.user.VIPUser;

public class _04_GenericClass {
    public static void main(String[] args) {
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("Kim"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("Seo"));
        c8.ready();

        System.out.println("-------------------------");
        orderCoffee("Elise");
        orderCoffee(36);

        System.out.println("-------------------------");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("coffee is ready: " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + "coffee is ready: " + name);
    }
}
