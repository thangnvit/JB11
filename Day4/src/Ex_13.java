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

    //xoa
    public void delete(int number) {
        for (int i = foundIndex(number); i < n-1; i++) {
            myArray[i] = myArray[i + 1];
        }
            n--;
    }
//    public void insert(int number){
//      //  System.out.println(foundIndex(number));
//        for(int i=n;i>foundIndex(number);i--){
//            myArray[i] = myArray[i-1];
//            System.out.println(myArray[i]);
//        }
////       myArray[foundIndex(number)+1] = values;
    public void edit(int number,int values){

            myArray[foundIndex(number)] = values;

    }

    public static void main(String[] args) {
        Ex_13 ex13 = new Ex_13();
        Scanner scan = new Scanner(System.in);
        int num;
        int values;
        System.out.println("Nhap do rong cua mang");
        ex13.inPut();
//        System.out.println("Cac phan tu trong mang");
//        ex13.outPut();
        System.out.println("Phan tu lon nhat = " + ex13.foundMax() + "  Chi so: " + (ex13.foundIndex(ex13.foundMax())+1));
        System.out.println("Phan tu nho nhat = " + ex13.foundMin() + "  Chi so: " + (ex13.foundIndex(ex13.foundMin())+1));
//        System.out.println("Nhap so can xoa:");
//        num = scan.nextInt();
//        ex13.delete(num);
//        System.out.println("Sau khi them ta duoc mang:");
//        ex13.outPut();
        System.out.println("Nhap vi tri sua sau so:");
        num = scan.nextInt();
        System.out.println("Nhap gia tri:");
        values = scan.nextInt();
        ex13.edit(num,values);
        System.out.println("Sau khi sua ta duoc mang:");
        ex13.outPut();

    }
}
