package ru.itpark;

public class Cat {
    private Animal animal;

    public Cat(int weight, String name) {
        animal = new Animal(weight, name);
    }

    public void present() {
        System.out.println("I'm cat " + animal.getName() + " and my weight is " + animal.getWeight());
    }

    public void eat(int foodAmount) {
        if (foodAmount >= 0) {
            animal.setWeight(animal.getWeight()+ foodAmount / 2);
        }
    }

    public void go() {
        animal.setWeight(animal.getWeight());
    }


    public void presentName() {
        System.out.println(animal.getName());
    }
}
