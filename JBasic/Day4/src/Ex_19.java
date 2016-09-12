import java.util.Scanner;

public class Ex_19 {
    public static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("sau khi hoan doi:");
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        int a=4;
        int b=5;
        System.out.println(a);
        System.out.println(b);
        swap(a,b);
    }
}
