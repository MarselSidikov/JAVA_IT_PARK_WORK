package ru.itpark;

public class Consumer extends Thread {
    private final Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    public void run() {
        while (true) {
            synchronized (product) {
                while (!product.isReady()) {
                    System.out.println("Клиент ждет, пока постель заправят");
                    try {
                        product.wait();
                    } catch (InterruptedException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
                System.out.println("Клиент полежал");
                product.use();
                // оповестили поток, который ушел
                // в ожидание на product о том, что
                // мы освободили product
                product.notify();
            }
        }
    }

}
