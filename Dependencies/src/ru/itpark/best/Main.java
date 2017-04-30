package ru.itpark.best;


public class Main {
    public static void main(String[] args) {
        Alarmer alarmer = new AlarmerSoutImpl();
        Terminal terminal = new Terminal(alarmer);
        terminal.giveMoney(100);
    }
}
