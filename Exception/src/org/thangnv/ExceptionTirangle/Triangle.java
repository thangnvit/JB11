package org.thangnv.ExceptionTirangle;

/**
 * Created by DEV on 8/15/2016.
 */
public class Triangle {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if(!isTriangle()){
           throw new IllegalArgumentException("Do dai 3 canh khong thoa man");
        }
    }

    public boolean isTriangle() {

        if ((side1 + side2 > side3) || (side1 + side3 > side2) || (side2 + side3 > side1)) {
           return true;
        }
        return false;
    }
}
