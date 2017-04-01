package ru.itpark.models;

import ru.itpark.interfaces.Presentable;

public class Cat extends Animal implements Presentable {

    public Cat(int weight, String name) {
        super(weight, name);
    }

    public void present() {
        System.out.println("I'm cat " + this.getName() + " and my weight is " + this.getWeight());
    }

    public void eat(int foodAmount) {
        if (foodAmount >= 0) {
            super.weight = super.weight + foodAmount / 2;
        }
    }

    public void go() {
        this.weight = this.weight - 1;
    }


    public void presentName() {
        System.out.println(getName());
    }
}
