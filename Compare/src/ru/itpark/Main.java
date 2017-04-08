package ru.itpark;

import java.util.Objects;

public class Main {



    /**
    public static void sort(Human[] humans) {
        for (int i = humans.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (humans[j].compareTo(humans[j+1]) > 0) {
                    Human temp = humans[j];
                    humans[j] = humans[j+1];
                    humans[j+1] = temp;
                }
            }
        }
    }

    public static void sort(Rectangle[] rectangles) {
        for (int i = rectangles.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (rectangles[j].compareTo(rectangles[j+1]) > 0) {
                    Rectangle temp = rectangles[j];
                    rectangles[j] = rectangles[j+1];
                    rectangles[j+1] = temp;
                }
            }
        }
    }
    */
    public static void print(Object objects[]) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }

    public static void main(String[] args) {
        Human regina = new Human(3, "Regina", 19);
        Human alina = new Human(2, "Alina", 18);
        Human marsel = new Human(1, "Marsel", 23);
        Human rustam = new Human(5, "Rustam", 33);
        Human ruslan = new Human(4, "Ruslan", 25);

        Human humans[] = {regina, alina, marsel, ruslan, rustam};

        ArraysUtils.sort(humans);

        print(humans);

        Rectangle a = new Rectangle(3, 4);
        Rectangle b = new Rectangle(2, 1);
        Rectangle c = new Rectangle(2, 2);
        Rectangle d = new Rectangle(1, 1);
        Rectangle e = new Rectangle(5, 6);

        Rectangle rectangles[] = {a, b, c, d, e};

        ArraysUtils.sort(rectangles);

        print(rectangles);

        HumansByIdComparator humansByIdComparator = new HumansByIdComparator();
        ArraysUtils.sort(humans, humansByIdComparator);

        print(humans);

    }
}
