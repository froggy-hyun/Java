package 기말고사.ch05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 소규모 영화관 좌석 배열
        // A1 ~ A5
        // B1 ~ B5
        // C1 ~ C5
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 3 X 5 크기의 2차원 배열의 표현
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        System.out.println(seats[1][1]);  // B2
        System.out.println(seats[2][4]);  // C5

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        System.out.println(seats2[0][2]);  // A3
        System.out.println(seats2[0][3]);  // error


    }
}
