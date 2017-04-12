package ru.itpark.animals;


public class Koala extends Animal {
    private int sleepingHours;

    public Koala(String name, int weight, int sleepingHours) {
        super(name, weight);
        if (sleepingHours >= 0) {
            this.sleepingHours = sleepingHours;
        } else sleepingHours = 1;
    }

    public int getSleepingHours() {
        return sleepingHours;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Koala) {
            Koala that = (Koala)obj;
            return this.name.equals(that.name) && this.weight == that.weight &&
                    this.sleepingHours == that.sleepingHours;
        } else {
            return false;
        }
    }
}
