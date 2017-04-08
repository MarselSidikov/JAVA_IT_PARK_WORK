package ru.itpark;

/**
 * Created by Student21 on 08.04.2017.
 */
public class Rectangle implements Comparable {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int area() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int compareTo(Object object) {
        if (object instanceof Rectangle) {
            Rectangle that = (Rectangle)object;
            return this.area() - that.area();
        } else {
            System.err.println("Cannot cast to Rectangle");
            return 0;
        }
    }
}
