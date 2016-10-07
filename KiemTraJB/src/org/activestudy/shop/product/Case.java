package org.activestudy.shop.product;

/**
 * Created by DEV on 8/5/2016.
 */
public class Case extends Product {
    private Ram ram;
    private Cpu cpu;

    public Case(String id, String name,Ram ram, Cpu cpu) {
        super(id,name,0);
        this.price = (ram.price + cpu.price)*10/100;
        this.ram = ram;
        this.cpu = cpu;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Ram getRam() {

        return ram;
    }

    public Cpu getCpu() {
        return cpu;
    }

    @Override
    public String toString() {
        return "Case{" +
                ram + " , " +
                cpu + + this.price +
                '}';
    }

}
