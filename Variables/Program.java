class Program {
	public static void main(String[] args) {
		int x = 7;
		int y = 8;
		int c = x + y;

		// x - 8, y - 7
		int temp = y;
		y = x;
		x = temp;

		System.out.println(c);

		// int operations: +, -, *, {/, %}
		int v = 7 / 3; // v = 2

		double d = 7.8;
		// left - double, rigth - int
		// neyavnoye preobrazovaniye
		d = 7 / 3; // d - 2.0
		d = 8; // d - 8.0
		d = 7.0 / 2; //d - 3.5

		// yavnoye preobr.
		int u = (int)7.5; // u - 7

	}
}