package ru.itpark;

public class Human {
    private int age;
    private String name;

    public int inn;

    public Human() {
    }

    public Human(int age, String name, int inn) {
        this.age = age;
        this.name = name;
        this.inn = inn;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getInn() {
        return inn;
    }

    @Override
    public String toString() {
        return "Human{}";
    }
}
