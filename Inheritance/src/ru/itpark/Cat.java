package ru.itpark;

public class Cat extends Animal {

    public Cat(int weight, String name) {
        super(weight, name);
    }

    public void go() {
        this.weight = this.weight - 1;
    }
}
