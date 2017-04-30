package ru.itpark.bad;

public class Terminal extends Alarmer {
    private int money;

    public Terminal(int money) {
        alarm();
        this.money = money;
    }

    public void giveMoney(int money) {
        this.money =- money;
    }
}
