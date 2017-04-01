package ru.itpark.models;

import ru.itpark.interfaces.Presentable;

public class Koala extends Animal implements Presentable {

    private int sleepingHours;

    public Koala(int weight, String name, int sleepingHours) {
        super(weight, name);
        // вызываем конструктор животного
        if (sleepingHours >= 0) {
            this.sleepingHours = sleepingHours;
        } else {
            this.sleepingHours = 1;
        }
    }

    public void sleep(int sleepingHours) {
        if (sleepingHours >= 0) {
            this.sleepingHours = this.sleepingHours + sleepingHours;
        } else {
            this.sleepingHours = this.sleepingHours + 0;
        }
    }

    public void present() {
        System.out.println("I'm koala " + this.getName() + " and my weight is " + this.getWeight() +
                " and my sleeping hours is " + this.getSleepingHours());
    }

    public void eat(int foodAmount) {
        super.weight = super.weight + foodAmount * 2;
    }

    public int getSleepingHours() {
        return sleepingHours;
    }

    @Override
    public void presentName() {
        System.out.println(getName());
    }
}
