class Program {
	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}

	public static int sum(int a, int b, int c) {
		int result = a + b + c;
		return result;
	}

	public static double averageOfArray(int a[]) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}

		return sum / a.length;
	}

	//написать функцию, возвразающую сумму чисел 
	// от a до b 

	public static void main(String[] args) {
		int x = 6;
		int y = 7;
		int c = sum(x, y, 5);

		System.out.println(c);
		
		int b[] = {1,2,3,4};
		System.out.println(averageOfArray(b));
	}
}