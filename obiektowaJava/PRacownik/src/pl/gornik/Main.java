package pl.gornik;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("Zabka","Kopernika 2137");

        Scanner scanner = new Scanner(System.in);
        Product product1 = new Product("mleko", "nabiał", 4.75, 1, "litr");
        Product product2 = new Product("ser żółty", "sery", 7.99, 300, "gram");
        Product product3 = new Product("chleb pełnoziarnisty", "pieczywo", 1.5, 1, "ilość");
        Product product4 = new Product("pomidor", "warzywa", 0.50, 1, "ilość");
        Product product5 = new Product("ser biały", "sery", 9.50, 250, "gram");
        Product product6 = new Product(product4);

        List<Product> products = new ArrayList<>();
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);
        shop.addProduct(product4);
        shop.addProduct(product5);
        shop.addProduct(product6);


        System.out.println("Podaj nazwe produktu, aby znalesc go w sklepie: ");
        String name = scanner.nextLine();
        Product product = shop.findProductByName(name);
        if(product !=null){
            System.out.println("Znaleziono produkt o nazwie %s"+name);
            System.out.println(product);
        }
        else System.out.println("Nie znaleziono produktow ");

    }


    public void moreExpensiveThan5(List<Product> products){
        for (Product product : products) {
            if(product.getPrice() > 5.0) System.out.println(products);;
        }
    }


}