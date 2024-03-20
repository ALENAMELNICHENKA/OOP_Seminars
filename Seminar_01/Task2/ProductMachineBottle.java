import java.util.ArrayList;
import java.util.List;

public class ProductMachineBottle implements ProductMachine {

    List<Product> listProduct = new  ArrayList<Product>();

    public void initProducts(List<Product> listProd) {
        this.listProduct = listProd;
    }

    public Product getProduct(String name) {
        for (Product prod : listProduct) {
            if (prod.getName().equals(name)) {
                return prod;
            }
            
        }
        return null;
    }

    public List<Product> getList() {
        return listProduct;

    }
    
    
}
