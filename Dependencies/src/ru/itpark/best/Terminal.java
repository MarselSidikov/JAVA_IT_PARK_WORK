package ru.itpark.best;

public class Terminal {
    private int money;
    private Alarmer alarmer;

    public Terminal(Alarmer alarmer) {
        this.alarmer = alarmer;
    }

    public Terminal(int money) {

        this.money = money;
    }

    public void giveMoney(int money) {
        alarmer.alarm();
        this.money =- money;
    }
}
