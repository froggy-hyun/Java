package 중간고사.task04;

import java.util.Scanner;

public class _Quiz_06 {
    // 인스턴스 변수로 이름, 주민번호, 전화번호
    private String name;
    private String ssn;
    private String phone;

    // getData 메소드: 데이터를 입력받는 메소드
    public void getData() {
        Scanner scanner = new Scanner(System.in);

        // 데이터 입력 받기
        System.out.print("이름을 입력하세요: ");
        this.name = scanner.nextLine();

        System.out.print("주민번호를 입력하세요 (예: 990130-1234567): ");
        this.ssn = scanner.nextLine();

        System.out.print("전화번호를 입력하세요 (예: 010-1234-5678): ");
        this.phone = scanner.nextLine();
    }

    // translateData 메소드: 비식별 처리된 데이터를 반환하는 메소드
    public void translateData() {
        // 이름의 첫 글자만 남기고 '**'로 처리
        this.name = this.name.substring(0, 1) + "**";

        // 주민번호에서 뒷자리는 '*'로 처리
        this.ssn = this.ssn.substring(0, 8) + "******";

        // 전화번호에서 뒷자리는 '*'로 처리
        this.phone = this.phone.substring(0, this.phone.length() - 4) + "****";
    }

    // 개인정보 출력 메소드
    public void printCertificate() {
        System.out.println("증명서");
        System.out.println("이름: " + this.name);
        System.out.println("주민번호: " + this.ssn);
        System.out.println("전화번호: " + this.phone);
    }

    public static void main(String[] args) {
        // 객체 생성
        _Quiz_06 cert = new _Quiz_06();

        // 데이터 입력받기
        cert.getData();

        // 비식별 처리
        cert.translateData();

        // 결과 출력
        cert.printCertificate();
    }

}
