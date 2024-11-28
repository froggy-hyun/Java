package 기말고사.test08.coffee;

public class CoffeeByNumber {
    public int waitingNumber;

    public CoffeeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }

    public void ready() {
        System.out.println("coffee is ready : " + waitingNumber);
    }
}
