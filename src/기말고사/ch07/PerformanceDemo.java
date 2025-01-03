package 기말고사.ch07;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> li = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            al.add(0, i);
        }
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("ArrayList: " + duration);

        start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            li.addFirst(i);
        }
        end = System.nanoTime();
        duration = end - start;
        System.out.println("LinkedList: " + duration);
    }
}
