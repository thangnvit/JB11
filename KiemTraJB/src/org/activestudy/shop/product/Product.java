package org.activestudy.shop.product;

/**
 * Created by DEV on 8/5/2016.
 */
public abstract class Product {
    protected  String id;
    protected String name;
    protected int price;

    public Product(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
    public abstract String toString();
}
