package ru.itpark.array;

/**
 * Created by Student21 on 15.04.2017.
 */
public class ObjectsArrayList {
  private final int MAX_SIZE = 5;

  private Object elements[];
  private int count;

  public ObjectsArrayList() {
    this.elements = new Object[MAX_SIZE];
    this.count = 0;
  }

  public void add(Object element) {
    this.elements[count] = element;
    count++;
  }

  public Object get(int index) {
    return this.elements[index];
  }
}
