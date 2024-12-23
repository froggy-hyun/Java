package 기말고사.ch07.test07;

public class _01_Generics {
    public static void main(String[] args) {
//        int[] iArray = {1, 2, 3, 4, 5};
//        double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
//        wrapper class 사용
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("==================================");
        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

//    private static void printIntArray(int[] iArray) {
    private static void printIntArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.println(i + "");
        }
        System.out.println();
    }

//    private static void printDoubleArray(double[] dArray) {
    private static void printDoubleArray(Double[] dArray) {
        for (double d : dArray) {
            System.out.println(d + "");
        }
        System.out.println();

    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.println(s + "");
        }
        System.out.println();

    }

//    private static <Teacher> void printAnyArray(Teacher[] array) {
//    private static <K> void printAnyArray(K[] array) {
//    private static <V> void printAnyArray(V[] array) {
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.println(t + " ");
        }
        System.out.println();
    }
}
