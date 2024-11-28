package 기말고사.task08;

import java.util.Stack;

public class _04_StackList {
    public static void main(String[] args) {
        Stack<String> s1 = new Stack<>();

        s1.push("a");
        s1.push("b");
        s1.push("c");

        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());

        Stack<String> s2 = new Stack<>();
        s2.add(String.valueOf(10));
        s2.add(String.valueOf(20));
        s2.add(String.valueOf(100));

        for (String value : s2) {
            System.out.println(value + " ");
        }
        System.out.println();

        while (!s1.isEmpty()) {
            System.out.println(s2.pop() + " ");
        }

        s1.clear();
        System.out.println(s1.pop());
    }
}

