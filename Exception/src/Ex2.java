import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by DEV on 8/12/2016.
 */
public class Ex2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);
        int index,value;
        do{
            System.out.println("Nhap gia tri:");
            value = scan.nextInt();
            System.out.println("Nhap vi tri:");
            index = scan.nextInt();
        } while(!add(array,index,value));
        show(array);

    }
    public static boolean add(int[] array,int index,int value) {
        try {
            for (int i = 0; i < array.length; i++) {
                array[index] = value;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Vuot qua gioi han mang");
            return false;
        }
        return true;
    }
    public static void show(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
