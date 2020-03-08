package pl.sda.zamowienia;

import pl.sda.zamowienia.exceptions.price.PriceException;

public class Product {
    private String name;
    private double price;
    private Category category;

    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws PriceException {
        if(PriceIsPositive(price)) {
            this.price = price;
        }
        else{
            throw new PriceException("Cena musi być większa od 0");
        }
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    public boolean PriceIsPositive(double price){
        if(price>0.0){
            return true;
        }
        else{
            return false;
        }
    }
}
