package ru.itpark;

public class SimpleMath {
    public boolean isPrime(int number) {
        if (number == 2 || number == 3) {
            return true;
        }

        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int sumInRange(int a, int b) {
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }

        return sum;
    }
}
