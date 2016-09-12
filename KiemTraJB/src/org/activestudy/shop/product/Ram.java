package org.activestudy.shop.product;

/**
 * Created by DEV on 8/5/2016.
 */
public class Ram extends Product{
    private int capacity;
    public Ram(String id, String name, int price, int capacity) {
        super(id, name, price);
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    @Override
    public String toString() {
        return "Ram{name=" + this.name +
                ",capacity=" + capacity + ",price="+ this.price +
                '}';
    }

}
