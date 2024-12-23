package 기말고사.ch07.test07;


import 기말고사.ch07.test07.coffee.CoffeeByNickName;
import 기말고사.ch07.test07.coffee.CoffeeByNumber;

public class _02_GenericClass01 {
    public static void main(String[] args) {
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();
        CoffeeByNickName c2 = new CoffeeByNickName("Patrick");
        c2.ready();
    }
}
