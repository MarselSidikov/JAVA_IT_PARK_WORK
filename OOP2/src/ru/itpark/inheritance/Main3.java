package ru.itpark.inheritance;

import ru.itpark.animals.Animal;
import ru.itpark.animals.Koala;
import ru.itpark.animals.Tiger;

public class Main3 {
    public static void main(String[] args) {
        Koala koala = new Koala("Koala", 3, 10);
        Tiger tiger = new Tiger("Tiger", 2, 10);
        Koala koala2 = new Koala("Koala2", 1, 7);
        Tiger tiger2 = new Tiger("Tiger2", 6, 5);
        Koala koala3 = new Koala("Koala3", 5, 6);

        Animal animal = koala;

        Animal animals[] = {koala, tiger, koala2, tiger2, koala};

        for (int i = animals.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (animals[j].getWeight() > animals[j+1].getWeight()) {
                    Animal temp = animals[j];
                    animals[j] = animals[j+1];
                    animals[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
    }
}
