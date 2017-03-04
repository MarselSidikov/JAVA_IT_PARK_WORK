import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner();

		int a = scanner.nextInt();
		int sum = 0;
		while (a != 0) {
			sum = sum + a % 10;
			a = a / 10;
		}
	}
}