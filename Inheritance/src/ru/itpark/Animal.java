package ru.itpark;

public class Animal {
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

    public void eat(int foodAmount) {
        if (foodAmount >= 0) {
            this.weight = this.weight + foodAmount;
        } else {
            this.weight = this.weight + 0;
        }
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
