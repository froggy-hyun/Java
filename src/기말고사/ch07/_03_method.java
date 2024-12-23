package 기말고사.ch07;

public class _03_method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "A1";
        System.out.println(b1.modelName);

        b1.autoReport();
        BlackBox.canAutoReport = true;
        b1.autoReport();

        b1.insertMemoryCard(16);

        int fileCount = b1.getImageFile(1);
        System.out.println("File count: " + fileCount);
        fileCount = b1.getImageFile(2);
        System.out.println("File count: " + fileCount);
        fileCount = b1.getImageFile(4);
        System.out.println("File count: " + fileCount);
    }
}
