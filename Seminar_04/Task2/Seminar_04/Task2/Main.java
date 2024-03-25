package Seminar_04.Task2;
public class Main {
    public static void main(String[] args) {
        
        Warehouse<String, Integer> warehouse = new Warehouse<>();

        Product<String> product1 = new Product<>("apple");
        Product<String> product2 = new Product<>("blackberry");

        warehouse.addProduct(product1, 800);
        warehouse.addProduct(product2, 300);
        System.out.println("apple " + warehouse.getProductQuantity(product1));
        System.out.println("blackberry " + warehouse.getProductQuantity(product2));
        warehouse.removeProduct(product2);
        System.out.println("apple " + warehouse.getProductQuantity(product1));
        System.out.println("blackberry " + warehouse.getProductQuantity(product2));

    }
}
