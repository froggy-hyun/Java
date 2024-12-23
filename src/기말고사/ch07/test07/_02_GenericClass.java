package 기말고사.ch07.test07;

import 기말고사.ch07.test07.coffee.*;
import 기말고사.ch07.test07.user.User;
import 기말고사.ch07.test07.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {

        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();
        CoffeeByNickName c2 = new CoffeeByNickName("Patrick");
        c2.ready();

        System.out.println("===================================");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("Nick");
        c4.ready();

        System.out.println("===================================");
        int c3Name = (int) c3.name;
        System.out.println("Order Number is : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("Order Name is : " + c4Name);

        System.out.println("===================================");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        Coffee<String> c6 = new Coffee<>("Sam");
        c6.ready();

        int c5Name = c5.name;
        System.out.println("Order Number is : " + c5Name);
        String c6Name = c6.name;
        System.out.println("Order Name is : " + c6Name);

        System.out.println("===================================");
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
