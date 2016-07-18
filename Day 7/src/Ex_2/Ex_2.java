package Ex_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        String phoneNumber;
        PhoneEntry newPhoneEntry;
        newPhoneEntry = new PhoneEntry("thang", "011111111111");
        PhoneEntry newPhoneEntry2 = new PhoneEntry("nam", "091212121");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry(newPhoneEntry);
        phoneBook.addEntry(newPhoneEntry2);
        System.out.println("1.Them lien lac");
        System.out.println("2.Sua lien lac");
        System.out.println("3.Xoa lien lac");
        System.out.println("4.Tim kiem lien lac");
        System.out.println("5.Hien thi tat ca lien lac");
        System.out.println("Moi ban nhap lua chon:");
        int choose;
        choose = scan.nextInt();
        scan.nextLine();
        switch (choose) {

            case 1:
                System.out.println("Nhap ten:");
                name = scan.nextLine();
                System.out.println("Nhap SDT");
                phoneNumber = scan.nextLine();
                newPhoneEntry = new PhoneEntry(name, phoneNumber);
                phoneBook.addEntry(newPhoneEntry);
                System.out.println("Danh sach sau khi them");
                System.out.printf(phoneBook.toString());
                break;
            case 2:
                System.out.println("Nhap ten:");
                name = scan.nextLine();
                System.out.println("Nhap SDT moi");
                phoneNumber = scan.nextLine();
                phoneBook.editEntry(name, phoneNumber);
                System.out.println("Sau khi sua");
                System.out.printf(phoneBook.toString());
                break;
            case 3:
                System.out.println("Nhap ten LL can xoa:");
                name = scan.nextLine();
                phoneBook.deleteEntry(name);
                System.out.println("Danh ba sau khi xoa:");
                System.out.println(phoneBook.toString());
                break;
            case 4:
                System.out.println("Nhap ten LL tim kiem");
                name = scan.nextLine();
                System.out.println(phoneBook.findEntryByName(name));
                break;
            case 5:
                System.out.println("Danh sach lien lac:");
                System.out.println(phoneBook.toString());

        }
    }
}
