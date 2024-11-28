package 기말고사.test08;

import 기말고사.test08.coffee.CoffeeByName;
import 기말고사.test08.coffee.CoffeeByNumber;

public class _01_GenericClass {
    public static void main(String[] args) {
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();
        CoffeeByName c2 = new CoffeeByName("Patrick");
        c2.ready();
    }

}
