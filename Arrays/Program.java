class Program {
	public static void main(String[] args) {
		int a[];
		a = new int[5];

		a[0] = -6;
		a[1] = -1;
		a[2] = 1;
		a[3] = 4;
		a[4] = 2;

		/*
		int i = 0;
		while (i < a.length) {
			System.out.print(a[i] + " ");
			i = i + 1;
		}
		*/

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}