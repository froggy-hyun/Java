package 기말고사.ch08.prac08;

import java.io.File;
import java.io.IOException;

public class _05_File {
    public static void main(String[] args) {
        String fileName = "test.txt";
        File file = new File(fileName);

        try {
            file.createNewFile();
            if (file.exists()) {
                System.out.println(file.getName());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.length());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
