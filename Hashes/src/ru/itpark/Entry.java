package ru.itpark;

/**
 * Created by Student21 on 29.04.2017.
 */
public class Entry<K, V> {
    private K key;
    private V value;
    private int hash;

    public Entry(K key, V value, int hash) {
        this.key = key;
        this.value = value;
        this.hash = hash;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }
}
