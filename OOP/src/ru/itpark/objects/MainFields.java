package ru.itpark.objects;

public class MainFields {

    public static void main(String[] args) {
	    // объявил переменную класса
        Student alina;
        // создал объект класса
        alina = new Student();

        // . - оператор, позволяющий получить
        // доступ к членам класса
        alina.age = 18;
        alina.name = "Alina";
        alina.passed = true;
        /*
        alina.marks = new int[2];
        alina.marks[0] = 5;
        alina.marks[1] = 5;
         */
        alina.marks = new int[]{5,5};

        System.out.println(alina.name);

        Student regina = alina;

        regina.name = "Regina";

        System.out.println(alina.name);
        System.out.println(alina.marks[0]);



    }
}
