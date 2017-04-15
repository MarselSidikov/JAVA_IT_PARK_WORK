package ru.itpark;

/**
 * Created by Student21 on 15.04.2017.
 */
public class Triangle extends Figure {
  private int a;
  private int b;
  private int c;

  public Triangle(String name, int a, int b, int c) {
    super(name);
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  public int getC() {
    return c;
  }

  @Override
  public String toString() {
    return super.name + " " + this.a + " " + this.b + " " + this.c;
  }
}
