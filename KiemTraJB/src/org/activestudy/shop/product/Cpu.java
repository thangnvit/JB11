package org.activestudy.shop.product;

/**
 * Created by DEV on 8/5/2016.
 */
public class Cpu extends Product{
    private float freq;

    public Cpu(String id, String name, int price, float freq) {
        super(id, name, price);
        this.freq = freq;
    }

    public void setFreq(float freq) {
        this.freq = freq;
    }

    public float getFreq() {

        return freq;
    }

    @Override
    public String toString() {
        return "Cpu{name=" + this.name +
                " ,freq=" + freq +",price="+ this.price +
                '}';
    }
}
