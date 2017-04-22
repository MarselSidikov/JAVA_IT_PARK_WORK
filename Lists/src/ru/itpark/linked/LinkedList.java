package ru.itpark.linked;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {

    private class LinkedListIterator implements Iterator<E> {

        Node<E> current;

        LinkedListIterator(Node<E> begin) {
            current = begin;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E value = current.value;
            current = current.next;
            return value;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator(head);
    }

    private class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node<E> head;
    private Node<E> tail;

    private int count;

    public LinkedList() {
        this.head = null;
        this.count = 0;
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<E>(element);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        count++;
    }

    public void addLast(E element) {
        Node<E> newNode = new Node<E>(element);

        /* без tail
        Node<E> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
        */

        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    public E get(int index) {
        Node<E> current = head;
        int i = 0;

        while (i < index) {
            current = current.next;
            i++;
        }

        return current.value;
    }

    public int getCount() {
        return count;
    }
}
