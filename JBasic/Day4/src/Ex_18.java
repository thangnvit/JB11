
public class Ex_18 {
    int year;
    public boolean isLeapYear(int year) {
        return((year %4==0 && year%100 !=0) || year%400 == 0);
    }

    public static void main(String[] args) {
        Ex_18 ex18 = new Ex_18();
        System.out.println(ex18.isLeapYear(1600));
    }
}
