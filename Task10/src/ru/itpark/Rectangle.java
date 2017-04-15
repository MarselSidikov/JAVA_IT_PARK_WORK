package ru.itpark;

/**
 * Created by Student21 on 15.04.2017.
 */
public class Rectangle extends Figure {
  private int a;
  private int b;

  public Rectangle(String name, int a, int b) {
    super(name);
    this.a = a;
    this.b = b;
  }

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  @Override
  public String toString() {
    return super.name + " " + this.a + " " + this.b;
  }
}
