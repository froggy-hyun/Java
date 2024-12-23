package 기말고사.ch07.example07;

public class _01_Generic {
    public static void main(String[] args) {
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

//        printDoubleArray(dArray);
//        printStringArray(sArray);

        System.out.println("====================");
        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
        printAnyArray(iArray, sArray);
    }

    private static <T, V> void printAnyArray(T[] array, V[] array2) {
        for (T t : array) {
            System.out.println(t + "");
        }
        System.out.println();
    }

    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.println(t + "");
        }
        System.out.println();
    }

//    private static void printStringArray(String[] sArray) {
//    }
//
//    private static void printDoubleArray(double[] dArray) {
//
//    }
//
//    private static void printIntArray(String[] sArray) {
//    }

}
