package HW;

public class HDProductMachine implements ProductMachine {

    @Override

    public void getProduct() {

    }

    public HDProductMachine getProduct(String name, int volume, int temperature) {
        return new HDProductMachine();
    }


}
