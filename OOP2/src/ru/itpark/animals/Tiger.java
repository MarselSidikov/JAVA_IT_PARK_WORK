package ru.itpark.animals;

import ru.itpark.interfaces.Presentable;

public class Tiger extends Animal implements Presentable {
    private int distance;

    public Tiger(String name, int weight, int distance) {
        super(name, weight);
        if (distance >= 0) {
            this.distance = distance;
        } else this.distance = 1;
    }

    public int getDistance() {
        return distance;
    }

    public String toString() {
        return super.toString() + " " + this.distance;
    }

    @Override
    public void present() {
        System.out.println("I'm a tiger!");
    }
}
