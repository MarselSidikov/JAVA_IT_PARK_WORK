package ru.itpark;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        new Producer(product).start();
        new Consumer(product).start();
    }
}
