package ru.itpark;

/**
 * Created by User on 25.03.2017.
 */
public class MergeSorter {
    // вспомогательный массив для слияния
    private int helpArray[];

    public MergeSorter() {
        helpArray = new int[10];
    }

    /**
     * Сливает части массива
     * a = array[lower..middle] и b = array[middle + 1..higher]
     * @param array сам массив, в котором нужно выполнить слияние
     * @param lower нижняя граница
     * @param middle середина
     * @param higher верхняя граница
     */
    public void merge(int array[], int lower, int middle, int higher) {
        // копируем весь массив array[lower..higher]
        for (int currentIndex = lower; currentIndex <= higher; currentIndex++) {
            helpArray[currentIndex] = array[currentIndex];
        }

        // i - бегает по первому подмассиву
        // j - по второму подмассиву
        int i = lower, j = middle + 1;
//      // currentIndex бегает по всему массиву
        for (int currentIndex = lower; currentIndex <= higher; currentIndex++) {
            // если i дошел до середины
            if (i > middle) {
                // докидываем все из второй половинки
                array[currentIndex] = helpArray[j];
                j++;
            } else if (j > higher) {
                array[currentIndex] = helpArray[i];
                i++;
            } else if (helpArray[j] < helpArray[i]) {
                array[currentIndex] = helpArray[j];
                j++;
            } else {
                array[currentIndex] = helpArray[i];
                i++;
            }
        }

    }
}
