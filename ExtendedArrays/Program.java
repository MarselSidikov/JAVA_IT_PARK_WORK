class Program {
	public static void main(String[] args) {
		int x = 8;
		int y = x;

		y = 10;

		System.out.println(x);

		int a[] = {1, 2, 3, 4, 5};
		int b[] = a;

		b[2] = 10;

		System.out.println(a[2]);
	}
}