package ru.itpark.best;

/**
 * Created by Student21 on 29.04.2017.
 */
public class AlarmerSoutImpl implements Alarmer {
    public void alarm() {
        System.out.println("Money given");
    }

    public void killClient() {
        System.out.println("Client killed");
    }
}
