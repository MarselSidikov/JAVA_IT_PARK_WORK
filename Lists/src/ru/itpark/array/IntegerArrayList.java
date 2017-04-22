package ru.itpark.array;

public class IntegerArrayList {
  private final int MAX_SIZE = 5;

  private int elements[];
  private int count;

  public IntegerArrayList() {
    this.elements = new int[MAX_SIZE];
    this.count = 0;
  }

  public void add(int element) {
    this.elements[count] = element;
    count++;
  }

  public int get(int index) {
    return this.elements[index];
  }
}
