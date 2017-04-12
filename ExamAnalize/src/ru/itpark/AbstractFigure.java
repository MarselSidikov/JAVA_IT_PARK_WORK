package ru.itpark;

/**
 * Created by admin on 11.04.2017.
 */
public abstract class AbstractFigure implements Figure {
    public boolean equals(Object object) {
        if (object instanceof Figure) {
            Figure that = (Figure)object;
            return this.area() == that.area()
                    && this.perimeter() == that.perimeter();
        } else {
            return false;
        }
    }
}
