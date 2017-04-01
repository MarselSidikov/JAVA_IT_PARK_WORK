package ru.itpark;

public class Animal {
    private int weight;
    private String name;

    public Animal(int weight, String name) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            this.weight = 1;
        }

        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
