package 기말고사.ch08;

import java.io.File;

public class _06_Folder {
    public static void main(String[] args) {
        String folderName = "src/기말고사/ch08/A";
        File folder = new File(folderName);
        folder.mkdir();
        if (folder.exists()) {
            System.out.println("folder exists : " + folder.getAbsolutePath());
        }

        folderName = "src/기말고사/ch08/A/B/C";
        folder = new File(folderName);
        folder.mkdirs(); // 존재하는 폴더가 있도록 서브폴더 만들 때 사용

        if (folder.exists()) {
            System.out.println("folder exists : " + folder.getAbsolutePath());
        } else {
            System.out.println("folder fails : ");
        }
    }
}
