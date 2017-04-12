package ru.itpark.inheritance;

import ru.itpark.animals.Animal;

public class MainWithClasses {
    public static void main(String[] args) {
        Animal koala = new Animal("Koala", 3);
        Animal tiger = new Animal("Tiger", 2);
        Animal bear = new Animal("Bear", 10);
        Animal bird = new Animal("Bird", 1);
        Animal mouse = new Animal("Mouse", 0);

        Animal animals[] = {koala, tiger, bear, bird, mouse};

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
            System.out.println(animals[i].getName() + " " + animals[i].getWeight());
        }
    }
}
