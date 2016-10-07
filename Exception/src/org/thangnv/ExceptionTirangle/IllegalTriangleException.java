package org.thangnv.ExceptionTirangle;

/**
 * Created by DEV on 8/15/2016.
 */
public class IllegalTriangleException extends Exception {
    public void getMesseage(){
        System.out.println("3 canh khong thoa man" + super.getMessage());
    }
}
