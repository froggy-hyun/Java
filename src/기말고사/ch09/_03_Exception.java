package 기말고사.ch09;

public class _03_Exception {
    public static void main(String[] args) {
        int age = 17;
        try {
            if (age < 19) {
                throw new Exception("Permission Deny");
            } else {
                System.out.println("Permission Granted");
            }
            System.out.println(3/8);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
