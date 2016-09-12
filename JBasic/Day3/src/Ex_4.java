/**
 * Created by DEV on 6/27/2016.
 */
import java.util.Scanner;
public class Ex_4 {
    private String s1;
    private String s2;
    Scanner scan = new Scanner(System.in);
    //Ham check Substring
    public void checkSubString()
    {
        System.out.println("Nhập vào chuỗi 1:");
        s1 = scan.nextLine();
        System.out.println("Nhập vào chuỗi 2:");
        s2 = scan.nextLine();
        if(s1.contains(s2) == true)
        {
            System.out.println("Chuỗi 2 là substring chuỗi 1");
        }
        else
        {
            System.out.println("Chuỗi 2 không là substring chuỗi 1");
        }
    }

    public static void main(String[] args) {
        Ex_4 ex4 = new Ex_4();
        ex4.checkSubString();

    }
}
