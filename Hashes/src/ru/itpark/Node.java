package ru.itpark;

public class Node<K,V> {
    private Entry<K,V> entry;
    private Node<K,V> next;

    public Node(Entry<K, V> entry) {
        this.entry = entry;
    }

    public Entry<K, V> getEntry() {
        return entry;
    }

    public void setEntry(Entry<K, V> entry) {
        this.entry = entry;
    }

    public Node<K, V> getNext() {
        return next;
    }

    public void setNext(Node<K, V> next) {
        this.next = next;
    }
}
