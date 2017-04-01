package ru.itpark;


public class ArrayList implements List {
    private static final int MAX_SIZE = 5;
    private int count;
    private int elements[];

    public ArrayList() {
        elements = new int[MAX_SIZE];
    }

    @Override
    public boolean add(int element) {
        return false;
    }

    public boolean addToEnd(int element) {
        if (count < MAX_SIZE) {
            elements[count] = element;
            count++;
            return true;
        } else {
            System.err.println("Места больше нет!");
            return false;
        }
    }

    @Override
    public boolean insert(int element, int index) {
        return false;
    }

    @Override
    public boolean removeByIndex(int index) {
        return false;
    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int find(int element) {
        return 0;
    }

    @Override
    public void reverse() {

    }

    @Override
    public int size() {
        return 0;
    }
}
