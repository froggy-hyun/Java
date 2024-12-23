package 기말고사.ch07.task08;

import java.util.HashMap;

public class _05_MapList {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("사과", 5);
        map.put("바나나", 3);
        map.put("포도", 10);
        map.put("딸기", 1);
        System.out.println(map.size());
        System.out.println(map.get("사과"));
        System.out.println(map.get("호두"));

        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key) + "개 있습니다.");
        }
    }
}
