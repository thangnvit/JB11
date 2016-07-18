import Ex_2.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by DEV on 7/11/2016.
 */
public class Ex_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] phoneNumber = new String[2];
        phoneNumber[0] = "092121212";
        phoneNumber[1] = "0144444444";
        PhoneEntry phoneEntry = new PhoneEntry("thang", phoneNumber);
        PhoneEntry phoneEntry2 = new PhoneEntry("nam",phoneNumber);
        PhoneEntry[] phoneEntries = new PhoneEntry[2];
        phoneEntries[0] = phoneEntry;
        phoneEntries[1] = phoneEntry2;
        PhoneBook phoneBook = new PhoneBook(phoneEntries);
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
                String entryName, newphoneNumber;
                System.out.println("Nhap ten:");
                newphoneNumber = scan.nextLine();
                if (phoneBook.isDuplicateName(newphoneNumber)) {
                    System.out.println("Ten da ton tai trong danh ba:");
                    System.out.println("Nhap so dien thoai tiep theo:");
                    newphoneNumber = scan.nextLine();
                    if (phoneBook.isDuplicateNumber(newphoneNumber)) {
                        System.out.println("So dien thoai nay da co");

                    } else {
                        phoneEntry.addPhoneNumber(newphoneNumber);

                    }
                } else {
                    System.out.println("Nhap SDT:");
                    newphoneNumber = scan.nextLine();
                    PhoneEntry newphoneEntries = new PhoneEntry();
                    newphoneEntries.setName(newphoneNumber);
                    newphoneEntries.addPhoneNumber(newphoneNumber);
                    phoneBook.addEntry(newphoneEntries);
                }
                System.out.println("Danh ba sau khi them");
                System.out.println(phoneBook.toString());
                break;
            case 2:

                int n;
                System.out.println("Nhap ten lien lac can sua:");
                entryName = scan.nextLine();
                System.out.println("Lien lac co tat ca bao nhieu SDT:");
                n = scan.nextInt();
                scan.nextLine();
                String[] newPhoneNuber = new String[n];
                for(int i=0;i<newPhoneNuber.length;i++){
                    System.out.println("Nhap SDT thu "+(i+1));
                    newPhoneNuber[i] = scan.nextLine();
                }
                phoneBook.editEntry(entryName,newPhoneNuber);
                System.out.println("Danh sach sau khi sua");
                System.out.println(phoneBook.toString());
                break;
            case 3:
                System.out.println("Nhap ten LL can xoa:");
                entryName = scan.nextLine();
                phoneBook.deleteEntry(entryName);
                System.out.println("Danh sach sau khi xoa:");
                System.out.println(phoneBook.toString());
                break;
            case 4:
                System.out.println("Nhap ten LL tim kiem");
                entryName = scan.nextLine();
                System.out.println(phoneBook.findEntryByName(entryName));
                break;
            case 5:
                System.out.println("Danh ba:");
                System.out.println(phoneBook.toString());
        }
    }
}
