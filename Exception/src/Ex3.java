/**
 * Created by DEV on 8/15/2016.
 */

import com.sun.jmx.snmp.internal.SnmpSubSystem;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float term1, term2;
        String s;
        try {
            System.out.println("Nhập số hạng 1:");
            term1 = scan.nextFloat();
            System.out.println("Nhập số hạng 2:");
            term2 = scan.nextFloat();
            System.out.println("Phép tính:");
            scan.nextLine();
            s = scan.nextLine();
            Caculator(s, term1, term2);
        } catch (InputMismatchException ex){
            System.out.println("Nhap sai toan hang");
        }
    }

    public static void Caculator(String s,float term1,float term2)
    {
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
//                break;
//            default:
//                System.out.println("Bạn đã nhập sai toán tử");
        }
    }
}