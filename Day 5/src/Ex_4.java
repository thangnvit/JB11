import java.util.Scanner;
public class Ex_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Nhap do rong mang");
        n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Nhap mang");
        input(arr,n);
        if(isSorted(arr))
            System.out.println("Mang da duoc sap xep");
        else
            System.out.println("Mang chua duoc sap xep");
    }
    public static void input(int arr[],int n){
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
    }
    public static boolean isSorted(int arr[]){
        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j])
                    return false;
            }
        return true;
    }
}
