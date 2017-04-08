package ru.itpark;

import java.util.Scanner;

public class MainArithmeticException {

    public static int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("НА НОЛЬ ДЕЛИШЬ!!");
        } else {
            return a / b;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите, пожалуйста, два числа");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            try {
                int result = div(a, b);
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.err.println("Деление на ноль в " + e.getStackTrace()[0]);
            }
        }

    }
}
