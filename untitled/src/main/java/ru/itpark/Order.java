package ru.itpark;

/**
 * Created by Student21 on 17.04.2017.
 */
public class Order {
  private Product[] products = new Product[10];
  private int count = 0;

  public void addProduct(Product product) {
    if (count < products.length) {
      products[count] = product; // положили элемент по индексу count
      count++;
    } else {
      Product[] temp = new Product[products.length * 2];
      // перекинули все элемента массива
      for (int i = 0; i < products.length; i++) {
        temp[i] = products[i];
      }
      products = temp;
      products[count] = product; // положили элемент по индексу count
      count++;
    }
  }

  public Product getProduct(int index) {
    return products[index];
  }
}
