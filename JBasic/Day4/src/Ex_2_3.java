import java.util.Scanner;

public class Ex_2_3 {
    Scanner scan = new Scanner(System.in);

    //Vong lap while
    public void whileLoop(int number) {
        int i = 0;
        while (i < number) {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }
    }
    //lap do while
    public void doWhileLoop(int number)
    {
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<number);
    }
    //lap for
    public void doLoop(int number){
        for(int i=0;i<number;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Ex_2_3 ex = new Ex_2_3();
 //       ex.whileLoop(10);
//       ex.doWhileLoop(10);
        ex.doLoop(10);
    }
}
