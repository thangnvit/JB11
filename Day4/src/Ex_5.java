import java.util.Scanner;
public class Ex_5 {
    Scanner scan = new Scanner(System.in);
    private int number =0;
    int total=0;
    public int setNumber(int number)
    {
        return number;
    }
    public int total(int number)
    {
        total = total + number;
        return total;
    }

    public static void main(String[] args) {
        Ex_5 ex5 = new Ex_5();
        Scanner scan = new Scanner(System.in);
        int num;
        int entry=-1;
        System.out.println("Nhap 1 so nguyen bat ky");
        do{

            num = scan.nextInt();
            ex5.setNumber(num);
            ex5.total(num);
            entry++;
        }while(num !=0);
        System.out.println("Tong cac so nguyen vua nhap la:" + ex5.total(num));
        System.out.println("Trung binh cong cac so nguyen vua nhap:" + ex5.total(num)/entry);
    }
}
