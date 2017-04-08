package ru.itpark.unchecked;

public class MainOutOfMemoryError {
    public static void main(String[] args) {
        try {
            String strings[] = new String[Integer.MAX_VALUE - 1000];
        } catch (OutOfMemoryError e) {
            System.out.println("HAHA");
        }
    }
}
