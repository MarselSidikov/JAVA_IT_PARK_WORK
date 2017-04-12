package ru.itpark.animals;


public class Koala extends Animal {
    private int sleepingHours;

    // конструктор коалы - имя, вес, количество часов, которые она проспала
    public Koala(String name, int weight, int sleepingHours) {
        // вызываем конструктор предка - ОБЯЗАТЕЛЬНО ПРИ НАСЛЕДОВАНИИ
        super(name, weight);
        // оставшиеся параметры инициализируем здесь
        if (sleepingHours >= 0) {
            this.sleepingHours = sleepingHours;
        } else this.sleepingHours = 1;
    }

    public int getSleepingHours() {
        return sleepingHours;
    }

    public String toString() {
        return super.toString() + " " + this.sleepingHours;
    }

    public boolean equals(Object object) {
        if (object instanceof Koala) {
            // нисходящее преобразование
            Koala that = (Koala)object;
            return this.name.equals(that.name)
                    && this.weight == that.weight
                    && this.sleepingHours == that.sleepingHours;
        } else return false;
    }
}
