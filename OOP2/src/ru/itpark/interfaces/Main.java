package ru.itpark.interfaces;

import ru.itpark.animals.Tiger;

public class Main {
    public static void main(String[] args) {
        Human a = new Human();
        Human b = new Human();
        Human c = new Human();

        Batman d = new Batman();

        Tiger e = new Tiger("Tiger",10, 12);

        Presentable[] presentables = {a, b, c, d, e};

        for (int i = 0; i < presentables.length; i++) {
            presentables[i].present();
        }


    }
}
