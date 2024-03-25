 package Seminar_04.Task2;

import java.util.HashMap;
import java.util.Map;

public class Warehouse <T, K extends Number> {
    Map<Product<T>, K> inventory;

    public Warehouse() {
        inventory = new HashMap<>();
    }

    //Метод для добавления на склад
    public void addProduct(Product<T> product, K quantity) {
        inventory.put(product, quantity);

    }

    //Метод для удаления со склада
    public void removeProduct(Product<T> product) {
        inventory.remove(product);
    }

    //Метод для подсчета остатка продуктов
    public K getProductQuantity(Product<T> product) {
        return inventory.getOrDefault(product, null);
    }
}