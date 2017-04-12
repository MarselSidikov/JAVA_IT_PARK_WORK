package ru.itpark.inheritance;


import ru.itpark.animals.Animal;
import ru.itpark.animals.Koala;

public class MainToString {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 13);
        System.out.println(animal);
        Koala koala = new Koala("Koala", 10, 5);
        System.out.println(koala);
    }
}

