package 기말고사.prac08;

import java.io.File;

public class _09_DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.delete()) {
            System.out.println("Successfully deleted file: " + file.getName());
        } else {
            System.out.println("Failed to delete file: " + file.getName());
        }

        File folder = new File("A");
        if (folder.exists()) {
            if (folder.delete()) {
                System.out.println("Successfully deleted folder: " + folder.getAbsolutePath());
            } else {
                System.out.println("Failed to delete folder: " + folder.getAbsolutePath());
            }
        }

        if (deleteFolder(folder)) {
            System.out.println("Successfully deleted folder: " + folder.getAbsolutePath());
        } else {
            System.out.println("Failed to delete folder: " + folder.getAbsolutePath());
        }
    }

    public static boolean deleteFolder(File folder) {
        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (!deleteFolder(file)) {
                        return false;
                    }
                }
            }
        }
        return folder.delete();
    }
}
