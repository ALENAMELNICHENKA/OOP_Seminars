import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product prod1 = new BattleOfWater("Квас", 3.0);
        Product prod2 = new BattleOfWater("Кефир", 2.0);
        Product prod3 = new BattleOfWater("Простокваша", 3.0);
        Product prod4 = new BattleOfWater("Сок", 1.0);

        ProductMachineBottle prodAuto = new ProductMachineBottle();
        prodAuto.initProducts(List.of(prod1, prod2, prod3, prod4));
        System.out.println(prodAuto.getList());
        System.out.println(prodAuto.getProduct("Квас"));

    }
}