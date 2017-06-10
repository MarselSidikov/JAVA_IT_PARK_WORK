package ru.itpark;

public class Product {
    // готовность продукта
    private boolean status = false;

    public boolean isReady() {
        return status;
    }

    // если продукт был готов, значит его не использовали
    // если продукт не готов, то он - использован
    public boolean isUsed() {
        return !status;
    }

    public void produce() {
        this.status = true;
    }

    public void use() {
        this.status = false;
    }
}
