package ru.itpark.equal;

import ru.itpark.animals.Koala;
import ru.itpark.animals.Tiger;

public class Main {
    public static void main(String[] args) {
        Koala koala =
                new Koala("Koala", 10, 10);
        Koala koala2 =
                new Koala("Koala", 10, 10);
        System.out.println(koala == koala2);
        System.out.println(koala.equals(koala2));

        Tiger tiger = new Tiger("Marsel", 62, 10000);
        System.out.println(koala.equals(tiger));
    }
}
