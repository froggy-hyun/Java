package 기말고사.ch07.test07.user;

public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }

    public void addPoint() {
        System.out.println(this.name + " point is added.");
    }
}
