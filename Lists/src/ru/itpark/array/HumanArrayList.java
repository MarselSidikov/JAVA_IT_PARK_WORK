package ru.itpark.array;

/**
 * Created by Student21 on 15.04.2017.
 */
public class HumanArrayList {
  private final int MAX_SIZE = 5;

  private Human elements[];
  private int count;

  public HumanArrayList() {
    this.elements = new Human[MAX_SIZE];
    this.count = 0;
  }

  public void add(Human element) {
    this.elements[count] = element;
    count++;
  }

  public Human get(int index) {
    return this.elements[index];
  }
}
