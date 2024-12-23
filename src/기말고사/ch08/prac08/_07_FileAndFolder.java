package 기말고사.ch08.prac08;

import java.io.File;

public class _07_FileAndFolder {
    public static void main(String[] args) {
        String folder = "C:\\JavaWorkSpace\\src\\기말고사\\prac08";

        File fileAndFolders = new File(folder);
        System.out.println("current folder path : " + fileAndFolders.getAbsolutePath());

        for (File file : fileAndFolders.listFiles()) {
            if (file.isFile()) {
                System.out.println("(File) " + file.getName());
            } else if (file.isDirectory()) {
                System.out.println("(Folders) " + file.getName());
            }
        }
    }
}
