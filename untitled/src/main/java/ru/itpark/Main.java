package ru.itpark;

/**
 * Created by Student21 on 17.04.2017.
 */
public class Main {
  public static void main(String[] args) {
    Order order = new Order();

    for (int i = 0; i < 10; i++) {
      Product product = new Product(i + 100, "Product No " + i, 5000);
      order.addProduct(product);
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(order.getProduct(i).getName());
    }
  }
}
