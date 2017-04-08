package ru.itpark;

public class ArraysUtils {

    public static void sort(Comparable comparables[]) {
        sort(comparables, null);
    }

    public static void sort(Object objects[], Comparator comparator) {
        boolean hasComparator = comparator != null;
        for (int i = objects.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                int compareResult;
                if (hasComparator) {
                    compareResult = comparator.compare(objects[j], objects[j+1]);
                } else {
                    Comparable comparableA = (Comparable)objects[j];
                    Comparable comparableB = (Comparable)objects[j+1];
                    compareResult = comparableA.compareTo(comparableB);
                }
                if (compareResult > 0) {
                    Object temp = objects[j];
                    objects[j] = objects[j+1];
                    objects[j+1] = temp;
                }
            }
        }
    }
}
