package 기말고사.ch07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {
    public static void main(String[] args) {
        // 사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성
        HashMap<String, Integer> scoreMap =
                new HashMap<String, Integer>();

        // 5 개의 점수 저장
        scoreMap.put("김은비", 97);
        scoreMap.put("하여린", 88);
        scoreMap.put("전아린", 98);
        scoreMap.put("이동건", 70);
        scoreMap.put("양승연", 99);
        System.out.println("HashMap의 요소 개수:" + scoreMap.size());

        // 모든 사람의 점수 출력.
        // javaScore에 들어 있는 모든 (key, value) 쌍 출력
        // key 문자열을 가진 집합 Set 컬렉션 리턴
        Set<String> keys = scoreMap.keySet();
        // key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
        Iterator<String> it = keys.iterator();
        while(it.hasNext()) {
            String name = it.next();
            int score = scoreMap.get(name);
            System.out.println(name + " : " + score);
        }
    }
}
