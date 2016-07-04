import java.util.Scanner;

public class Ex_14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, index, values;
        System.out.println("Nhap do rong mang:");
        n = scan.nextInt();
        int[] arr = new int[100];
        inPut(arr, n);
        System.out.println("Nhap vi tri can them:");
        index = scan.nextInt();
        System.out.println("Nhap gia tri can them:");
        values = scan.nextInt();
        n = insertArr(arr, n, index, values);
        System.out.println("Cac phan tu cua mang");
        outPut(arr, n);
        System.out.println("Nhap vi tri can xoa:");
        index = scan.nextInt();
        n = deleteArr(arr, n, index);
        System.out.println("Cac phan tu cua mang");
        outPut(arr, n);
        System.out.println("Nhap vi tri can sua:");
        index = scan.nextInt();
        System.out.println("Nhap gia tri can sua:");
        values = scan.nextInt();
        editArr(arr, n, index, values);
        System.out.println("Cac phan tu cua mang");
        outPut(arr, n);
    }

    //Ham nhap
    public static void inPut(int arr[], int n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            arr[i] = scan.nextInt();
        }
    }

    //Ham xuat
    public static void outPut(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    //Ham them
    public static int insertArr(int arr[], int n, int index, int values) {
        for (int i = n - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = values;
        n++;
        return n;
    }

    //Ham xoa
    public static int deleteArr(int arr[], int n, int index) {
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;
        return n;
    }

    //Ham sua
    public static void editArr(int arr[], int n, int index, int values) {
        arr[index] = values;
    }
}
