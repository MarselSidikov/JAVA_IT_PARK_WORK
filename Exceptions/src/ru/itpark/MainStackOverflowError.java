package ru.itpark;

public class MainStackOverflowError {
    public static void rec() {
        rec();
    }

    public static void main(String[] args) {
        rec();
    }
}
