package 기말고사.ch09;

public class _04_Exception {
    public static void main(String[] args) {
        try {
            System.out.println("Call a Text");
            throw new Exception("Off-Day");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception : " + e.getMessage());
        } finally {
            System.out.println("Leave a Taxi");
        }
    }
}
