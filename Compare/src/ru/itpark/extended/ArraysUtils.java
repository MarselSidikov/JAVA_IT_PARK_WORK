package ru.itpark.extended;

import ru.itpark.Comparable;
import ru.itpark.Comparator;

public class ArraysUtils {

    public static <T extends Comparable<T>> void sort(GenericArrayList<T> genericArrayList) {
        for (int i = genericArrayList.getCount() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                Comparable<T> a = genericArrayList.get(j);
                Comparable<T> b = genericArrayList.get(j+1);
                if (a.compareTo((T)b) > 0) {
                    T temp = (T)a;
                    genericArrayList.set(j, (T)b);
                    genericArrayList.set(j + 1, temp);
                }
            }
        }
    }
}
