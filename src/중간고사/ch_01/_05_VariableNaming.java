package 중간고사.ch_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수이름을 작성하는 방법
        // 1. 적당한 의미의 이름 사용
        // 2. 밑줄, 문자, 숫자의 조합 가능
        // 3. 밑줄, 문자로 시작 가능
        // 4. 한 단어 또는 두 단어 이상의 연속적인 단어사용 가능
        // 5. 소문자로 시작하고 이후 연속적인 단어의 시작 글자는 대문자로 사용
        // 6. 예약어 사용불가

        // 입국신고서
        String nationality = "대한민국";
        String firstName = "Patrick";
        String lastName = "LEE";
        String dataOfBirth = "2000-01-01";
        String residentialAddress = "Hilton Hotel";
        String purposeOfVisit = "touring";
        String flightNo = "KE657";
        String _flightNo = "KE657";
        String flight_no_2 = "KE657";
        //String flight-no = "KE657"; //오류

        int accompany = 2;
        int lengthOfStay = 5;

        String item1 = "시계";
        String item2 = "반지";
        //String 3item = "책"; //오류

        // 상수 : 절대변하지 않는 숫자 : 대문자로 그리고 final 선언 사용
        final String CODE = "KR";

    }
}
