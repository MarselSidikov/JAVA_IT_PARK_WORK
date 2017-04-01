package ru.itpark;

public class Koala extends Animal {

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

    public void eat(int foodAmount) {
        super.weight = super.weight + foodAmount * 2;
    }

    public int getSleepingHours() {
        return sleepingHours;
    }
}
