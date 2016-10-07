package Ex_2;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        day = 22;
        month = 11;
        year = 2000;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }


}
