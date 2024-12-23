//package 기말고사.ch08;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class _08_ReadWriteFile {
//    public static void main(String[] args) {
//        try (BufferedReader br = new BufferedReader(new FileReader("goodjab.txt"))) {
//            String line;
//            while ((line = br.readLine())!= null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
