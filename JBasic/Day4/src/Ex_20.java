import java.util.Scanner;

public class Ex_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap do rong mang:");
        int n;
        n = scan.nextInt();
        String[] arr = new String[n];
        inPut(arr, n);
        changeString(arr,n);

    }

    public static void inPut(String arr[], int n) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ptu thu " + i);
            arr[i] = scan.nextLine();
        }
    }

    public static void outPut(String arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void changeString(String arr[],int n) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                String temp;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        outPut(arr,n);
    }
}
