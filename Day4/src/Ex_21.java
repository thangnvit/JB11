
public class Ex_21 {
    public static void main(String[] args) {
        sum(6,7);
        sum(6,7,8);
        //thay doi kieu du lieu
        sum(6d,7d);
    }
    //Thay doi doi so
    public static void sum(int a,int b){
        System.out.println(a+b);
    }
    public static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    //Thay doi kieu du lieu
    public static void sum(double a,double b){
        System.out.println(a+b);
    }
}
