package ru.itpark;

public class Square extends Rectangle {
    public Square(int a) {
        super(a, a);
    }

    public boolean equals(Object object) {
        if (object instanceof Square) {
            return super.equals(object);
        } else {
            return false;
        }
    }
}
