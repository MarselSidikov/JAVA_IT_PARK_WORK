package ru.itpark.models;

import ru.itpark.interfaces.Aging;
import ru.itpark.interfaces.Presentable;

/**
 * Created by User on 01.04.2017.
 */
public class Human implements Presentable, Aging {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void present() {
        System.out.println("Hello, my name is " + this.name + " and I'm "
                + this.age + " years old");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void getOld() {
        this.age = this.age + 1;
    }

    public void presentName() {
        System.out.println(name);
    }
}
