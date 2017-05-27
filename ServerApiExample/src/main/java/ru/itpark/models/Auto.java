package ru.itpark.models;

public class Auto {
    private int id;
    private String model;

    public Auto(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public Auto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
