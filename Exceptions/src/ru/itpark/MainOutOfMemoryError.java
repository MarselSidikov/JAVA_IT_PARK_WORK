package ru.itpark;

public class MainOutOfMemoryError {
    public static void main(String[] args) {
        String strings[] = new String[Integer.MAX_VALUE - 1000];
    }
}
