package 기말고사.ch08.fileio_source.sec03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Temp\\org.txt"));) {

            br.lines().forEach(s -> System.out.println(s));
        } catch (IOException e) {
        }
    }
}