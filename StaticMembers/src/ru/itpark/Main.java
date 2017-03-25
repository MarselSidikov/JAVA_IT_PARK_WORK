package ru.itpark;

public class Main {

    public static void main(String[] args) {
        System.out.println(A.aStaticValue);
        A.aStaticValue = 20;
	    A a = new A();
        System.out.println(a.aStaticValue);
        a.aValue = 100;
	    a.aStaticValue = 500;

	    A a1 = new A();
	    a1.aValue = 200;

        System.out.println(a.aValue);
        System.out.println(a1.aValue);
        System.out.println(a1.aStaticValue);

        a.sum(10);
        A.sum(10);
    }
}
