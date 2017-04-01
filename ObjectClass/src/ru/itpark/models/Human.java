package ru.itpark.models;


public class Human {
    private String name;
    private int age;
    private int height;

    public Human(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public boolean equals(Object object) {
        if (object != null && object instanceof Human) {
            Human that = (Human)object;
            return this.age == that.age
                    && this.height == that.height
                    && this.name == that.name;
        } return false;
    }

    public String toString() {
        return this.name + " " + this.age + " " + this.height;
    }

}
