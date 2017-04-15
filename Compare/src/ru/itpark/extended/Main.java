package ru.itpark.extended;

import ru.itpark.Human;

/**
 * Created by Student21 on 15.04.2017.
 */
public class Main {
  public static void main(String[] args) {
    Human regina = new Human(3, "Regina", 19);
    Human alina = new Human(2, "Alina", 18);
    Human marsel = new Human(1, "Marsel", 23);
    Human rustam = new Human(5, "Rustam", 33);
    Human ruslan = new Human(4, "Ruslan", 25);

    GenericArrayList<Human> genericArrayList = new GenericArrayList();
    genericArrayList.add(regina);
    genericArrayList.add(alina);
    genericArrayList.add(marsel);
    genericArrayList.add(ruslan);
    genericArrayList.add(rustam);
    // genericArrayList.add(new Animal(10, "Marsel"));

    ArraysUtils.sort(genericArrayList);

    for (int i = 0; i < genericArrayList.getCount(); i++) {
      System.out.println(genericArrayList.get(i));
    }

    GenericArrayList<Animal> animalGenericArrayList = new GenericArrayList<>();
    animalGenericArrayList.add(new Animal(10, "Marsel"));
    animalGenericArrayList.add(new Animal(9, "Tiger"));
    animalGenericArrayList.add(new Animal(5, "Koala"));

    //ArraysUtils.sort(animalGenericArrayList);
  }
}
