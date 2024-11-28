package 기말고사.test08;

import 기말고사.test08.coffee.Coffee;

public class _03_GenericClass {
    public static void main(String[] args) {
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        Coffee<String> c6 = new Coffee<>("Sam");
        c6.ready();

    }
}
