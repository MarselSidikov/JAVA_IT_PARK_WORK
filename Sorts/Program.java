class Program {
	public static void sortSimpleInserts(int x[]) {
		for (int i = 0; i < x.length; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(x[k] + " ");
			}
			System.out.print("[");
			for (int k = i; k < x.length; k++) {
				System.out.print(x[k] + " ");
			}
			System.out.println("]");
			// find min
			int minElement = x[i];
			int minElementIndex = i;
			for (int j = i; j < x.length; j++) {
				if (minElement > x[j]) {
					minElement = x[j];
					minElementIndex = j;
				}
			}

			int temp = x[i];
			x[i] = x[minElementIndex];
			x[minElementIndex] = temp; 
		}
	}

	public static void sortBubble(int a[]) {
		for(int i = a.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int d[] = {-3, 10, 11, 12, 15, -5};
		sortSimpleInserts(d);

		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
	}
}