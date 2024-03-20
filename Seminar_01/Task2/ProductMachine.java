//import java.util.ArrayList;
import java.util.List;

public interface ProductMachine {

    public void initProducts(List<Product> listProd);
    public Product getProduct(String name);
        

    // List<Product> listProduct = new  ArrayList<Product>();

    // public void initProducts(List<Product> listProd) {
    //     this.listProduct = listProd;
    // }

    // public Product getProduct(String name) {
    //     for (Product prod : listProduct) {
    //         if (prod.getName().equals(name)) {
    //             return prod;
    //         }
            
    //     }
    //     return null;
    // }

    // public List<Product> getList() {
    //     return listProduct;

    // }
    
}
