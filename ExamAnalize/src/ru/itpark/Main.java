package ru.itpark;

public class Main {

    public static void main(String[] args) {
        /**
         * ЗАДАЧА:
         * Реализовать интерфейс Фигура тремя классами:
         * Квадрат, Треугольник, Прямоугольник
         * Создать массив фигур
         * Удалить из массива фигур эквивалентные фигуры
         * Фигуры эквивалентны тогда, когда
         * у них одинаковый тип и одинаковые площадь и периметр
         * удалить - сделать null
         */
        Triangle a = new Triangle(3, 4, 5);
        Square c = new Square(4);
        Rectangle e = new Rectangle(2, 2);
        Square d = new Square(4);
        Rectangle f = new Rectangle(2, 2);
        Triangle b = new Triangle(4, 3, 5);

        Figure figures[] = {a, c, e, d, f, b};

        for (int i = 0; i < figures.length - 1; i++) {
            for (int j = i + 1; j < figures.length -1; j++) {
                if (figures[i].equals(figures[j])) {
                    figures[i] = null;
                    figures[j] = null;
                    i++;
                }
            }
        }
    }
}
