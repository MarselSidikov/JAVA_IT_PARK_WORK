package ru.itpark;

public class Main {

    public static void main(String[] args) {
    	// объявляем массив, который хотим отсортировать
		int a[] = {4, -10, 11, 45, 0, -23, 35, 62, 11, 0, -9, 11, -3, 4, 5, 1};

		// создаем объект класса, который отвечает за сортировку
	    MergeSorter mergeSorter = new MergeSorter();
		// сортируем массив
	    mergeSorter.sort(a);
		// выводим на экран
	    for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
    }
}
