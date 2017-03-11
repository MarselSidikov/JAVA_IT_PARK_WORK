import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		int a[] = {-3, 10, 11, 12, 15, -5};

		int minIndex = 0;
		int maxIndex = 0;

		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
				minIndex = i;
			}
		}

		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
				maxIndex = i;
			}
		}

		int temp = a[minIndex];
		a[minIndex] = a[maxIndex];
		a[maxIndex] = temp;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}

		// считать с консоли число x, найти его позицию в массиве
		// если числа в массиве нет, вывести -1
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int indexX = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				indexX = i;
			}
		}

		System.out.println(indexX);
	}
}