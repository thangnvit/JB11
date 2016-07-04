import java.util.Scanner;

public class Ex_13 {
    Scanner scan = new Scanner(System.in);
    int[] myArray;
    int n;

    //ham nhap
    public void inPut() {
        n = scan.nextInt();
        myArray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i));
            myArray[i] = scan.nextInt();
        }
    }

    //ham xuat
    public void outPut() {
        for (int i = 0; i < n; i++) {
            System.out.println(myArray[i]);
        }
    }

    // tim max cua mang
    public int foundMax() {
        int temp = myArray[0];
        for (int i = 0; i < n; i++) {
            if (myArray[i] > temp) {
                temp = myArray[i];
            }
        }
        return temp;
    }

    // tim min
    public int foundMin() {
        int temp = myArray[0];
        for (int i = 0; i < n; i++) {
            if (myArray[i] < temp) {
                temp = myArray[i];
            }
        }
        return temp;
    }

    // tim chi so
    public int foundIndex(int number) {
        for (int i = 0; i < n; i++) {
            if (myArray[i] == number)
                return i;
        }
        return number;
    }

    public static void main(String[] args) {
        Ex_13 ex13 = new Ex_13();
        Scanner scan = new Scanner(System.in);
        int num;
        int values;
        System.out.println("Nhap do rong cua mang");
        ex13.inPut();
        System.out.println("Cac phan tu trong mang");
        ex13.outPut();
        System.out.println("Phan tu lon nhat = " + ex13.foundMax() + "  Chi so: " + (ex13.foundIndex(ex13.foundMax())+1));
        System.out.println("Phan tu nho nhat = " + ex13.foundMin() + "  Chi so: " + (ex13.foundIndex(ex13.foundMin())+1));


    }
}
