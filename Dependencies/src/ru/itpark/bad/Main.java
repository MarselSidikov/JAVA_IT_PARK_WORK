package ru.itpark.bad;

import ru.itpark.bad.Terminal;

public class Main {

    public static void main(String[] args) {
        Terminal terminal = new Terminal(100);
        terminal.giveMoney(5);
        terminal.killClient();
    }
}
