package ru.itpark.string;

/**
 * Created by admin on 11.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        // две объектные переменные - один объект и он помещается
        // в область памяти, называемую StringPool
        String a = "Hello";
        String b = "Hello";
        System.out.println(a == b);
        // создали явно два объекта - они не помещаются в StringPool
        a = new String("Hello");
        b = new String("Hello");
        System.out.println(a == b);
    }
}
