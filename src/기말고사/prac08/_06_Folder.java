package 기말고사.prac08;

import java.io.File;

public class _06_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir(); // 단일 디렉토리 생성

        if (folder.exists()) {
            System.out.println("folder exists : " + folder.getAbsolutePath());
        }

        folderName = "A/B/C";
        folder = new File(folderName);
        folder.mkdirs(); // 여러 디렉토리를 포함한 폴더 구조 생성

        if (folder.exists()) {
            System.out.println("folder exists : " + folder.getAbsolutePath());
        } else {
            System.out.println("folder fails : " + folderName);
        }
    }
}
