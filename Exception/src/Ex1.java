import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by DEV on 8/12/2016.
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;

        while (true){
            try {
                System.out.println("Nhap mot so nguyen");
                a = scan.nextInt();
                break;
            } catch (InputMismatchException ex){
                System.out.println("Chuong trinh yeu cau nhap so nguyen");
                scan.nextLine();
            }
        }
    }
}
