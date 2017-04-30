package ru.itpark;

import java.util.Scanner;

public class Prikol {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();
        // возвращает класс по имени
        Class aClass = Class.forName(className);
        Object object = aClass.newInstance();

        System.out.println(object);

    }
}
