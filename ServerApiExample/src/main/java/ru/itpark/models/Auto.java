package ru.itpark.models;

import javax.persistence.*;

@Entity
@Table(name = "auto")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String model;

    @Column(name = "owner_id")
    private Integer ownerId;

    public Auto(String model, Integer ownerId) {
        this.model = model;
        this.ownerId = ownerId;
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

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }
}
