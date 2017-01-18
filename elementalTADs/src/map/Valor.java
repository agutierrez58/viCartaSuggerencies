package map;

public class Valor<K, V> {
    private final K key;
    private V value;

    public Valor(K key, V value) {
            this.key = key;
            this.value = value;
    }

    public K getKey() {
            return key;
    }

    public V getValue() {
            return value;
    }

    public void setValue(V value) {
            this.value = value;
    }
}