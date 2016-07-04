import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        long number;
        System.out.println(isValid(4388576018402626l));
    }

    public static boolean isValid(long number){
        int[] arr = new int[16];
        int n=0;
        while(number !=0){
            arr[n] = (int)(number%10);
            number/=10;
            n++;
        }
        if(n>13 && n<16 && (arr[0] == 4 || arr[0] == 5 || arr[0] == 6 || (arr[0] == 3 && arr[0]==7)))
            return true;
        else
        return false;
    }
}
