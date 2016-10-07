import java.util.Scanner;

public class Ex_14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int[] arr = new int[n];
        input(arr,n);
 //       output(arr);
        int[] newarr = insert(arr,2,4);
        output(newarr);
    }
    public static void input(int arr[],int n){
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
    }

    public static void output(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.printf("%2d",arr[i]);
        }
    }

    public static int[] insert(int arr[], int index, int values){

        int[] newArr = new int[arr.length+1];
        for(int i=0;i<index;i++){
            newArr[i] = arr[i];
        }
        newArr[index] = values;
        for(int i=index+1;i<newArr.length;i++){
            newArr[i] = arr[i-1];
        }
        return newArr;
    }
}