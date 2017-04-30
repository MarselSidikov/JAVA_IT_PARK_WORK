package ru.itpark.better;

public class Terminal {
    private int money;
    private Alarmer alarmer;

    public Terminal() {
        this.alarmer = new Alarmer();
    }

    public Terminal(int money) {
        alarmer.alarm();
        this.money = money;
    }

    public void giveMoney(int money) {
        this.money =- money;
    }
}
