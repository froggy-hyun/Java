package 기말고사.ch07.test07.coffee;

public class CoffeeByNickName {
    public String nickName;

    public CoffeeByNickName(String nickName) {
        this.nickName = nickName;
    }

    public void ready() {
        System.out.println("coffee is ready : " + nickName);
    }
}
