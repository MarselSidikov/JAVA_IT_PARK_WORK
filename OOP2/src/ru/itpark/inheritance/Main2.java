package ru.itpark.inheritance;

import ru.itpark.animals.Animal;

/**
 * Решили все проблемы, которые были описаны в Main1
 * Но имеем новые проблемы: понятно, что разные животные
 * могут иметь разные параметры. Например - тигр имеет поле - дистанция, которую
 * он пробежал
 * Колала имеет поле - количество часов, которое она проспала
 * Возможное решение - добавить все эти поля в класс Animal
 * Решение - все общее засунуть в одну сущность, все частное - в другие сущности
 */
public class Main2 {
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
