package ru.itpark.polymorphism;

import ru.itpark.interfaces.Presentable;
import ru.itpark.models.Animal;
import ru.itpark.models.Cat;
import ru.itpark.models.Human;
import ru.itpark.models.Koala;

/**
 * Created by User on 01.04.2017.
 */
public class Main {

    public static void feedAnimals(Animal animals[]) {
        for (int i = 0; i < animals.length; i++) {
            animals[i].eat(2);
        }
    }

    public static void present(Presentable presentables[]) {
        for (int i = 0; i < presentables.length; i++) {
            presentables[i].present();
        }
    }

    public static void main(String[] args) {
        Koala koalaStalone = new Koala(5, "Stalone", 4);
        Koala koalaNorris = new Koala(10, "Norris", 10);
        Koala koalaVanDamm = new Koala(2, "VanDamm", 0);
        Cat catMurka = new Cat(3, "Murka");
        Cat catVasya = new Cat(1, "Vasya");
        Cat catSharikoBoris = new Cat(10, "SharikoBoris");

        Animal animals[] = { koalaStalone,
                catMurka,
                koalaNorris,
                catVasya,
                koalaVanDamm,
                catSharikoBoris };

        feedAnimals(animals);

        Human humans[] = {
                new Human("Marsel", 23),
                new Human("Regina", 19),
                new Human("Alina", 18)
        };

        Presentable animalsPresentable[] = {
                koalaStalone,
                catMurka,
                koalaNorris,
                catVasya,
                koalaVanDamm,
                catSharikoBoris
        };

        present(humans);
        present(animalsPresentable);

    }
}
