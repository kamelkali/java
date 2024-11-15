package pl.gornik;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private String location;
    private List<Product> products;

    public Shop(String name, String location) {
        this.name = name;
        this.products = new ArrayList<>();
        this.location = location;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void showProducts(){
        for (Product product: products){
            System.out.println(product);
        }
    }

    public List<Product> findProductsByCategory(String category){
        List<Product> foundProducts = new ArrayList<>();
        for (Product product : products) {
            if(product.getCategory().equals(category)) foundProducts.add(product);
        }
        return foundProducts;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public Product findProductByName(String name){
        for (Product product: products){
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
}
