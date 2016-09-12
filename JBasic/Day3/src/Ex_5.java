/**
 * Created by DEV on 6/27/2016.
 */

import java.util.Scanner;
public class Ex_5 {
    Scanner scan = new Scanner(System.in);
    private float term1, term2;
    private String s;

    public void Caculator()
    {
        System.out.println("Nhập số hạng 1:");
        term1 = scan.nextFloat();
        System.out.println("Nhập số hạng 2:");
        term2 = scan.nextFloat();
        System.out.println("Phép tính:");
        scan.nextLine();
        s = scan.nextLine();
        switch (s)
        {
            case "+":
                System.out.println("Kết quả : " + (term1 + term2));
                break;
            case "-":
                System.out.println("Kết quả: " + (term1 - term2));
                break;
            case "*":
                System.out.println("Kết quả: " + (term1 * term2));
                break;
            case ":":
                System.out.println("Kết quả: " + (term1 / term2));
                break;
            default:
                System.out.println("Bạn đã nhập sai toán tử");
        }
    }
    public static void main(String[] args) {
        Ex_5 ex5 = new Ex_5();
        ex5.Caculator();
    }
}

