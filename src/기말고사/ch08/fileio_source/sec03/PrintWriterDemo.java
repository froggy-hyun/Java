package 기말고사.ch08.fileio_source.sec03;

import java.io.*;

public class PrintWriterDemo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Temp\\org.txt"));
             PrintWriter pr = new PrintWriter(new FileWriter("D:\\Temp\\dup.txt"));) {

            br.lines().forEach(x -> pr.println(x));
        } catch (IOException e) {
        }
    }
}