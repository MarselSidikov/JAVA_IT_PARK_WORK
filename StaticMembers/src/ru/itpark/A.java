package ru.itpark;

public class A {
    public int aValue;
    public static int aStaticValue;

    static {
        aStaticValue = 10;
    }

    public static int sum(int x) {
        return x + aStaticValue;
    }
}
