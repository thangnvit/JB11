/**
 * Created by DEV on 6/27/2016.
 */
import java.util.Scanner;
public class Ex_3 {
    private int h,q,m,j,k;
    private int dayOfMonth,month,year;
    Scanner scan = new Scanner(System.in);
    public void foundDayOfWeek()
    {
        System.out.println("Nhap vao nam:");
        year = scan.nextInt();
        System.out.println("Nhap vao thang:");
        month = scan.nextInt();
        System.out.println("Nhap vao ngay cua thang:");
        dayOfMonth = scan.nextInt();
        if(month == 1)
        {
            month = 13;
            year = year -1;
        }
        if(month == 2)
        {
            month = 14;
            year = year -1;
        }
        q = dayOfMonth;
        m = month;
        j = year/100;
        k= year%100;
        h = ( q + (26*(m+1)/10) + k +  k/4 + j/4 + 5*j) % 7;
        System.out.println("Ngay cua tuan la thu " + h);


    }

    public static void main(String[] args) {
        Ex_3 ex3 = new Ex_3();
        ex3.foundDayOfWeek();
    }
}
