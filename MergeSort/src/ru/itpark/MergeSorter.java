package ru.itpark;

// Класс для сортировки слиянием
public class MergeSorter {
    // вспомогательный массив для слияния
    private int helpArray[];

    // закрытый метод для инициализации и инстантивации вспомогательного массива
    private void initHelpArray(int array[]) {
        this.helpArray = new int[array.length];
    }

    // главная функция сортировки
    public void sort(int array[]) {
        // инициализируем вспомогательный массив
        initHelpArray(array);
        // вызываем сортировку ВСЕГО массива
        sort(array, 0, array.length - 1);
    }

    /**
     * Рекурсивная процедура сортировки массива.
     * Сортирует в массиве array подмассив array[lower..higher]
     * @param array - исходный массив
     * @param lower - нижняя граница подмассива
     * @param higher - вернхняя граница подмассива
     */
    private void sort(int array[], int lower, int higher) {
        // если у нас начало и конец совпали - останавливаем
        if (higher <= lower) {
            return;
        }

        // вычисляем середину
        int middle = lower + (higher - lower) / 2;

        // сортируем левую половину
        sort(array, lower, middle);
        // сортируем правую половинку
        sort(array, middle + 1, higher);
        // сливаем
        merge(array, lower, middle, higher);
    }


    /**
     * Сливает части массива
     * a = array[lower..middle] и b = array[(middle + 1)..higher]
     * @param array сам массив, в котором нужно выполнить слияние
     * @param lower нижняя граница
     * @param middle середина
     * @param higher верхняя граница
     */
    private void merge(int array[], int lower, int middle, int higher) {
        // копируем весь массив array[lower..higher]
        for (int currentIndex = lower; currentIndex <= higher; currentIndex++) {
            helpArray[currentIndex] = array[currentIndex];
        }

        // i - бегает по первому подмассиву
        // j - по второму подмассиву
        int i = lower, j = middle + 1;
        // currentIndex бегает по всему массиву
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
