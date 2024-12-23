package 중간고사.ch_04;

public class _08_MainMethod {
    public static void main(String[] args) {
        for (String s : args){
            System.out.println(s);
        }

        // 도서관리 1.조회 2.대출 3.반납

        if (args.length == 1) {
            switch (args[0]){
                case "1":
                    System.out.println("도서조회");
                    break;
                case "2":
                    System.out.println("도서대출");
                    break;
                case "3":
                    System.out.println("도서반납");
                    break;
                default:
                    System.out.println("Error");
            }
        } else {
            System.out.println("Check User Manual");
        }
    }
}
