import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n;
        System.out.println("Nhap so nguyen:");
        n = scan.nextLong();
        System.out.println(sumOfDigit(n));
    }

    public static int sumOfDigit(long number) {
        int total = 0;
        while (number != 0) {
            total += number % 10;
            number /= 10;
        }
        return total;
    }
}
