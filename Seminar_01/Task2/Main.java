import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product prod1 = new Product("Хлеб", 1.0);
        Product prod2 = new Product("Молоко", 2.0);
        Product prod3 = new Product("Масло", 3.0);
        Product prod4 = new Product("Яблоко", 0.5);

        ProductMachine prodAuto = new ProductMachine();
        prodAuto.initProducts(List.of(prod1, prod2, prod3, prod4));
        System.out.println(prodAuto.getList());
        System.out.println(prodAuto.getProduct("Хлеб"));

    }
}