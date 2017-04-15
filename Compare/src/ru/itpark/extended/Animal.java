package ru.itpark.extended;

public class Animal {
  private int weight;
  private String name;

  public Animal(int weight, String name) {
    this.weight = weight;
    this.name = name;
  }

  public int getWeight() {
    return weight;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "weight=" + weight +
        ", name='" + name + '\'' +
        '}';
  }
}
