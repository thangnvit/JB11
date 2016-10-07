package org.thangnv.ExceptionTirangle;

import java.util.Scanner;

/**
 * Created by DEV on 8/15/2016.
 */
public class Main {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        double side1,side2,side3;
        System.out.println("Nhap vao cac canh cua tam giac");
        side1 = scan.nextInt();
        side2 = scan.nextInt();
        side3 = scan.nextInt();
 //       Triangle triangle = new Triangle(side1,side2,side3);
        try {
            Tamgiac tamgiac = new Tamgiac(side1,side2,side3);
        } catch (IllegalTriangleException e) {
            System.out.println("3 canh khong thoa man");
        }


    }
}
