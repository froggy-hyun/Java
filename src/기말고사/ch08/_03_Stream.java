package 기말고사.ch08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _03_Stream {
    public static void main(String[] args) {

        //Arrays.stream()
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"Java", "Python", "C", "C++", "C#"};
        Stream<String> stream = Arrays.stream(langs);

        //Collections Stream()
        List<String> langList = new ArrayList<>();
//        langList.add("Java");
//        langList.add("Python");
        langList = Arrays.asList("Java", "Python", "C", "C++", "C#");
        Stream<String> langListStream = langList.stream();

        //Stream.Of()
        Stream<String> langListOfStream = Stream.of("Java", "Python", "C", "C++", "C#");

        // 스트림 사용
        // 중간연산 (intermediate operation) : filter, map, sorted, distinct, ...
        // 최종연산 (terminal operation) : count, min, max, forEach, anymatch, ....
        
        // 1. 90점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        System.out.println("=============================");

        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("=============================");

        // 2. 90점 이상인 사람의 수
        int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("=============================");

        // 3. 90점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("=============================");

        // 4. 90점 이상인 점수들의 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("=============================");

        // "Java", "Python", "C", "C++", "C#"

        // 5. C 문자로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x -> x.startsWith("C")).forEach(System.out::println);
        System.out.println("=============================");

        // 6. Java 문자로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x -> x.contains("Java")).forEach(System.out::println);
        System.out.println("=============================");

        // 7. 4글자 이하의 언어를 정렬해서 출력
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("=============================");

        
        // 8. 4글자 이하의 언어 중에서 C 문자를 포함하는 언어
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("C"))
                .forEach(System.out::println);
        System.out.println("=============================");

        // 9. 4글자 이하의 언어 중에서 C 문자를 포함하는 언어가 하나라도 있는지 여부
        boolean anyMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("C"));
        System.out.println(anyMatch);

        // 10. 4글자 이하의 언어들은 모두 C 문자를 포함하는지 여부
        boolean allMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .allMatch(x -> x.contains("C"));
        System.out.println(allMatch);

        // 11. 4글자 이하의 언어 중에서 C 문자를 포함하는 언어 뒤에 특정 글자를 함께 출력
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("C"))
                .map(x -> x + " (is so difficult)")
                .forEach(System.out::println);
        System.out.println("=============================");

        // 12. C 문자를 포함하는 언어를 대문자로 출력
        langList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("=============================");

        // 13. C 문자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListStartsWithC = langList.stream()
                .filter(x -> x.contains("C"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        langListStartsWithC.stream().forEach(System.out::println);
        System.out.println("=============================");
    }
}
