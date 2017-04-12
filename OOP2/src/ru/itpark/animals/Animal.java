package ru.itpark.animals;

public class Animal {
    // поля - состояние объекта, его характеристики
    protected String name;
    protected int weight;
    // конструктор - задает начальное состояние объекта
    // состояние при создании
    public Animal(String name, int weight) {
        this.name = name;
        if (weight >= 0) {
            this.weight = weight;
        } else {
            this.weight = 1;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }


    public String toString() {
        return this.name + " " + this.weight;
    }
}
