/**
 * Created by DEV on 6/26/2016.
 */
import java.util.Scanner;
public class Ex_1 {
    private int year;
    private int month;
    Scanner scan = new Scanner(System.in);
    //Ham kiem tra nam nhuan
    public boolean leapYear(int year)
    {
        return((year % 4 == 0 && year %100 != 0) || year % 400 == 0);
    }
    //Ham in ra so ngay cua thang trong nam
    public void dayInMonth()
    {
        System.out.println("Nhap vao nam:");
        year = scan.nextInt();
        System.out.println("Nhap vao thang:");
        month = scan.nextInt();
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + month + " nam " + year + " co 31 ngay" );
                break;
            case 2:
                if(leapYear(year))
                    System.out.println("Thang " + month + " nam " + year + " co 29 ngay");
                else
                    System.out.println("Thang " + month + " nam " + year + " co 28 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + month + " nam " + year + " co 30 ngay" );
                break;
        }
    }

    public static void main(String[] args) {
        Ex_1 ex1 = new Ex_1();
        ex1.dayInMonth();
    }

}

