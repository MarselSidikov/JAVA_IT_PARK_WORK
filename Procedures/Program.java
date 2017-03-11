class Program {
	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}

	public static void swapMinMax(int a[]) {
		int minIndex = 0;
		int maxIndex = 0;

		int min = a[0];
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
				minIndex = i;
			}
			if (max < a[i]) {
				max = a[i];
				maxIndex = i;
			}
		}

		int temp = a[minIndex];
		a[minIndex] = a[maxIndex];
		a[maxIndex] = temp;
	}

	public static void main(String[] args) {
		int a = 6;
		int b = 7;

		swap(a, b);

		System.out.println("a=" + a + ", b=" + b);

		int d[] = {-3, 10, 11, 12, 15, -5};

		swapMinMax(d);

		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i] + " ");
		}
	}
}