package ru.itpark;

public class Producer extends Thread {
    private final Product product;

    public Producer(Product product) {
        this.product = product;
    }

    public void run() {
        while (true) {
            synchronized (product) {

                while (!product.isUsed()) {
                    System.out.println("Горничная ждет, пока кровать не используют");
                    // поток Producer будет ждать, пока другой поток
                    // не освободит product
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
                System.out.println("Горничная заправляет кровать");
                product.produce();
                product.notify();
            }
        }
    }

}
