package ru.itpark;

/**
 * Created by admin on 11.04.2017.
 */
public abstract class AbstractFigure implements Figure {
    // Сравнение фигур по площади и периметру
    public boolean equals(Object object) {
        // проверяем,с фигурой ли мы сравнием
        if (object instanceof Figure) {
            // нисходящее преобразование
            Figure that = (Figure)object;
            // сравнием по площади и по периметру
            return this.area() == that.area()
                    && this.perimeter() == that.perimeter();
        } else {
            return false;
        }
    }
}
