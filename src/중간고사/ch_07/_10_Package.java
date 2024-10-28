package 중간고사.ch_07;

import java.util.Random;

public class _10_Package {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(10));
        System.out.println(random.nextDouble());

        double min = 5.0;
        double max = 10.0;
        System.out.println((min + (max - min) * random.nextDouble()));
        System.out.println(random.nextBoolean());

        //1이상 45이하의 숫자 뽑기
        System.out.println(random.nextInt(45)+1);

        //Math, Scanner, StringBuilder, StringBuffer, StringTokenizer
        //BigInteger, BigDecimal
        //LocalDate, LocalTime, LocalDateTime, DataTimeFormatter
    }
}
