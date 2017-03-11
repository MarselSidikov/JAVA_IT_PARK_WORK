class Program {
	public static int fact(int n) {
		if (n == 1) {
			return 1;
		} else {
			System.out.println("fact(" + (n - 1) + ")*" + n);
			int result = fact(n - 1) * n;
			System.out.println("fact(" + (n - 1) + ")*" + n + "=" + result);
			return result;
		}
	}

	public static int fib(int n) {
		System.out.println("fib(" + n + ")");
		if (n > 1) {
			return fib(n - 1) + fib(n - 2);
		} else {
			return 1;
		}
	}
	public static void main(String[] args) {
		System.out.println(fact(5));
		System.out.println(fib(10));
	}
}