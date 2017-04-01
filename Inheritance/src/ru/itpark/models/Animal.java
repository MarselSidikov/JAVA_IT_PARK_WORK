package ru.itpark.models;

public abstract class Animal {
    protected int weight;
    private String name;

    public Animal(int weight, String name) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            this.weight = 1;
        }

        this.name = name;
    }

    public abstract void eat(int foodAmount);

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
