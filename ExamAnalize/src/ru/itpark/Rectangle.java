package ru.itpark;

/**
 * Created by admin on 11.04.2017.
 */
public class Rectangle extends AbstractFigure {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }

    public boolean equals(Object object) {
        if (object instanceof Rectangle) {
            return super.equals(object);
        } else {
            return false;
        }
    }
}
