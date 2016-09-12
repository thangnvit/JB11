import java.util.Scanner;

public class Ex_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int size = 101;
        int arr[] = new int[size];
        System.out.println("Nhap cac so nguyen nam trong khoang 0-100:");
        arr = input(size);
        displayNumberOccurrence(arr);
    }

    public static int[] input(int size) {
        Scanner scan = new Scanner(System.in);
        int newArr[] = new int[size];
        int number;
        do {
            number = scan.nextInt();
            if (number > 0 && number < 100) {
                newArr[number]++;
            } else {
                break;
            }
        } while (number != 0);

        return newArr;
    }

    public static void displayNumberOccurrence(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println("So " + i + " xuat hien " + arr[i] + " lan");
            }
        }
    }
}