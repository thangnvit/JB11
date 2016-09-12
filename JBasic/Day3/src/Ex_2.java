/**
 * Created by DEV on 6/27/2016.
 */
import java.util.Scanner;

import static java.lang.Math.scalb;
import static java.lang.Math.sqrt;

public class Ex_2{
    private float a;
    private float b;
    private float c;
    private float delta;
    Scanner scan = new Scanner(System.in);
    //Ham giai pt bac 2
    public void quadraticEquation2()
    {
        System.out.println("Nhap a,b,c:");
        a = scan.nextFloat();
        if(a==0)
            do{
                System.out.println("nhap lai");
                a = scan.nextFloat();
            }while(a == 0);
        b = scan.nextFloat();
        c = scan.nextFloat();
        delta =(b*b - 4*a*c);
        if(delta < 0)
        {
            System.out.println("Phuong trinh vo nghiem");
        }
        else
        {
            if(delta ==0)
            {
                System.out.println("Phuong trinh co nghiem kep x = " + ((-b) / (2*a)));
            }
            else
            {
                System.out.printf("Phuong trinh co 2 nghiem p/b: \n");
                System.out.println( (-b + sqrt(delta)) / (2*a) );
                System.out.println( (-b - sqrt(delta)) / (2*a) );
            }
        }
    }

    public static void main(String[] args) {
        Ex_2 ex2 = new Ex_2();
        ex2.quadraticEquation2();
    }

}
