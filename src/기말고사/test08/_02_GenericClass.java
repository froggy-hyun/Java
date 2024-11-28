package 기말고사.test08;

import 기말고사.test08.coffee.CoffeeByName;

public class _02_GenericClass {
    public static void main(String[] args) {
        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("Nick");
        c4.ready();

        System.out.println("----------------");
        int c3Name = (int) c3.name;
        System.out.println("Order Number is: " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("Order Name is: " + c4Name);

    }
}
