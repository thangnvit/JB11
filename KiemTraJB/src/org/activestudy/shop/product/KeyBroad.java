package org.activestudy.shop.product;

/**
 * Created by DEV on 8/5/2016.
 */
public class KeyBroad extends Product {
    private String type;

    public KeyBroad(String id, String name, int price, String type) {
        super(id, name, price);
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {

        return type;
    }

    @Override
    public String toString() {
        return "KeyBroad{name=" + this.name +
                "type='" + type + '\'' + ",price="+ this.price +
                '}';
    }
}
