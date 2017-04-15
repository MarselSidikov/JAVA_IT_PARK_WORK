package ru.itpark;

public class GenericArrayList<T> {
  private final int MAX_SIZE = 5;

  private Object elements[];
  private int count;

  public GenericArrayList() {
    this.elements = new Object[MAX_SIZE];
    this.count = 0;
  }

  public void add(T element) {
    this.elements[count] = element;
    count++;
  }

  public T get(int index) {
    return (T)this.elements[index];
  }
}
