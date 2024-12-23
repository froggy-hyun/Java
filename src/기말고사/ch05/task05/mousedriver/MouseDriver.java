package 기말고사.ch05.task05.mousedriver;

public interface MouseDriver {
    final int BUTTONS = 3;      // 올바름, final 생략 가능
    // int VERSION;                // 오류: 인터페이스의 필드는 반드시 초기화되어야 함
    void move();                // 올바름
    public int click();         // 올바름
    // protected int out();        // 오류: 인터페이스 메서드는 `protected`일 수 없음
    // static public void drag();  // 오류: `static` 메서드는 본문을 가져야 함
    default void drop() {       // 올바름
        System.out.println("drop");
    }
}
