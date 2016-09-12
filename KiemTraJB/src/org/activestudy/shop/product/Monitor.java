package org.activestudy.shop.product;

/**
 * Created by DEV on 8/5/2016.
 */
public class Monitor extends Product{
    private String resolution;

    public Monitor(String id, String name, int price, String resolution) {
        super(id, name, price);
        this.resolution = resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;

    }

    @Override
    public String toString() {
        return "Monitor{name=" + this.name +
                "resolution='" + resolution + '\'' +",price="+ this.price +
                '}';
    }
}
