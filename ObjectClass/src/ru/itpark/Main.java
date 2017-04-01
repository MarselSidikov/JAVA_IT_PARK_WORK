package ru.itpark;

import ru.itpark.models.Human;
import ru.itpark.models.Rectangle;

public class Main {

    public static void main(String[] args) {
        Human marsel =
                new Human("Marsel", 23, 185);

        Human elseMarsel = marsel;

        System.out.println(marsel == elseMarsel);

        elseMarsel =
                new Human("Marsel", 23, 185);

        System.out.println(marsel == elseMarsel);

        System.out.println(marsel.equals(elseMarsel));

        Rectangle rectangle = new Rectangle(10, 11);

        System.out.println(marsel.equals(rectangle));

        System.out.println(marsel);
    }
}
