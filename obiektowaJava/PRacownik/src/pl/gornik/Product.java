package pl.gornik;

public class Product {
    private String name;
    private String category;
    private double price;
    private double discount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getUnitMeasure() {
        return unitMeasure;
    }

    public void setUnitMeasure(String unitMeasure) {
        this.unitMeasure = unitMeasure;
    }

    private int unit;
    private String unitMeasure;

    public Product(String name, String category, double price, int unit, String unitMeasure) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.unit = unit;
        this.unitMeasure = unitMeasure;
    }

    public Product(Product product) {
        this(product.name, product.category, product.price, product.unit, product.unitMeasure);
    }

    public double getDiscount(double discount){
        return calculateDiscount(discount);
    }

    public void showProduct(){
        System.out.printf("Produkt: %s w cenie %.2f obnizono do kwoty %.2f",name,price,calculateDiscount(discount));
        System.out.println();
    }

    @Override
    public String toString() {
        return "pl.gornik.Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", unit=" + unit +
                ", unitMeasure='" + unitMeasure + '\'' +
                '}';
    }
    private double calculateDiscount(double discount){
        this.discount = discount;
        return price * (1- discount / 100);
    }
}