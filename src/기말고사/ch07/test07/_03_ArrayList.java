package 기말고사.ch07.test07;

import java.util.ArrayList;

public class _03_ArrayList {
    public static void main(String[] args) {
        int[] array = new int[3];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

//    List(arraylist, linkedlist, set, map)
        ArrayList<String> list = new ArrayList<>();

        list.add("You");
        list.add("Kim");
        list.add("Cho");
        list.add("Kang");
        list.add("Park");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("=========================");
        System.out.println(list.size());
        list.remove("Kang");
        System.out.println(list.size());
        System.out.println(list.get(3));
        list.remove(list.size() - 1);
        System.out.println(list.size());

        System.out.println("=========================");
        for(String s : list) {
            System.out.println(s);
        }
    }


}
