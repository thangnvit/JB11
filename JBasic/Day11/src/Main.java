import java.util.Scanner;

/**
 * Created by DEV on 8/1/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name,phoneNumber,cardNumber;
        int secretPIN;
        Account acc = new Account("1481310065", "thang", 4567, 10000);
        acc.setCardNumber(acc.generateRandomCardNumber());
        System.out.println("Ma the la:" + acc.getCardNumber());
        int choose;
        System.out.println("1.Thanh toan bang the Credit Card");
        System.out.println("2.Thanh toan bang Moblie Blanking");
        System.out.println("3.Thang toan truc tiep");
        choose = scan.nextInt();
        scan.nextLine();
        switch (choose) {
            case 1:
                System.out.println("Nhap ten:");
                name = scan.nextLine();
                System.out.println("Nhap card Number:");
                cardNumber = scan.nextLine();
                System.out.println("Nhap ma pin:");
                secretPIN = scan.nextInt();
        }
    }
}
