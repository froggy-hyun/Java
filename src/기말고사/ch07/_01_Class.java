package 기말고사.ch07;

public class _01_Class {
    public static void main(String[] args) {
        // 차량용 블랙박스 : 모델명, 해상도, 가격, 색상
        String modelName = "ABC1234";
        String resolution = "FHD";
        int price = 200000;
        String color = "red";

        String modelName2 = "EFG1234";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "blue";

        BlackBox bbox1 = new BlackBox();
        bbox1.modelName = modelName;
        bbox1.resolution = resolution;
        bbox1.price = price;
        bbox1.color = color;
        System.out.println(bbox1.modelName);
        System.out.println(bbox1.resolution);
        System.out.println(bbox1.price);
        System.out.println(bbox1.color);

        BlackBox bbox2 = new BlackBox();
        bbox2.modelName = modelName2;
        bbox2.resolution = resolution2;
        bbox2.price = price2;
        bbox2.color = color2;
        System.out.println(bbox2.modelName);
        System.out.println(bbox2.resolution);
        System.out.println(bbox2.price);
        System.out.println(bbox2.color);


    }
}
