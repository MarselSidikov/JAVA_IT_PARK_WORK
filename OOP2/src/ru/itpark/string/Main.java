package ru.itpark.string;

/**
 * Created by admin on 11.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        System.out.println(a == b);

        a = new String("Hello");
        b = new String("Hello");
        System.out.println(a == b);
    }
}
