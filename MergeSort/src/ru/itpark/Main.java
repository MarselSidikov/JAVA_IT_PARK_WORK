package ru.itpark;

public class Main {

    public static void main(String[] args) {
	    int a[] = {2, 3, 6, 1, 2, 4, 8};

	    MergeSorter mergeSorter = new MergeSorter();
	    mergeSorter.merge(a, 0, 2, 6);

	    for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
    }
}
