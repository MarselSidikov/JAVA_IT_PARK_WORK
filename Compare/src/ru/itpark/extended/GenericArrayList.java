package ru.itpark.extended;

public class GenericArrayList<T> {
  private final int MAX_SIZE = 10;

  private Object elements[];
  private int count;

  public int getCount() {
    return count;
  }

  public GenericArrayList() {
    this.elements = new Object[MAX_SIZE];
    this.count = 0;
  }

  public void add(T element) {
    this.elements[count] = element;
    count++;
  }

  public void set(int index, T value) {
    this.elements[index] = value;
  }

  public T get(int index) {
    return (T)this.elements[index];
  }
}
