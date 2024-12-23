package 기말고사.ch07;

class Entry<K, V> {
    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class EntryDemo {
    public static void main(String[] args) {
        Entry<String, Integer> e1 = new Entry<>("key1", 20);
        Entry<String, String> e2 = new Entry<>("key2", "value");

        System.out.println(e1.getKey() + " " + e1.getValue());
        System.out.println(e2.getKey() + " " + e2.getValue());
    }
}
