import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year, month;
        System.out.println("Nhap nam:");
        year = scan.nextInt();
        System.out.println("Nhap thang");
        month = scan.nextInt();
        printfMonth(year, month);
    }

    //Ham kiem tra nam nhuan
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    //Ham tinh ngay dau tien thang la thu may
    public static int getStartDay(int year, int month) {
        int m, j, k, h;
        if (month == 1 || month == 2) {
            month += 12;
            year = year - 1;
        }
        m = month;
        j = year / 100;
        k = year % 100;
        h = (1 + (26 * (m + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
        return h;
    }

    //Ham xac dinh ngay cua thang
    public static int getNumberOfDayInMonth(int year, int month) {
        int day = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                ;
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                if (isLeapYear(year))
                    day = 29;
                else
                    day = 28;
        }
        return day;
    }

    //Ham in tieu de lich
    public static void printMonthTitle(int year, int month) {
        String monthTitle = null;
        switch (month) {
            case 1:
                monthTitle = "January";
                break;
            case 2:
                monthTitle = "February";
                break;
            case 3:
                monthTitle = "March";
                break;
            case 4:
                monthTitle = "April";
                break;
            case 5:
                monthTitle = "May";
                break;
            case 6:
                monthTitle = "June";
                break;
            case 7:
                monthTitle = "July";
                break;
            case 8:
                monthTitle = "August";
                break;
            case 9:
                monthTitle = "September";
                break;
            case 10:
                monthTitle = "October";
                break;
            case 11:
                monthTitle = "November";
                break;
            case 12:
                monthTitle = "December";
                break;
        }
        System.out.println("                       " + monthTitle + "  " + year);
        System.out.println("---------------------------------------------------------");
        System.out.println("   Sun Mon Tue Wed Thu Fri Sat");
    }

    //Ham in than lich
    public static void printMonthBody(int year, int month) {
        int numberOfDay = getNumberOfDayInMonth(year, month);
        switch (getStartDay(year, month)) {
            case 0:
                System.out.printf("%29d", 1);
                break;
            case 1:
                System.out.printf("%5d", 1);
                break;
            case 2:
                System.out.printf("%9d", 1);
                break;
            case 3:
                System.out.printf("%13d", 1);
                break;
            case 4:
                System.out.printf("%17d", 1);
                break;
            case 5:
                System.out.printf("%21d", 1);
                break;
            case 6:
                System.out.printf("%25d", 1);
                break;
        }
        for (int i = 2; i <= numberOfDay; i++) {

            System.out.printf("%4d", i);
            if ((i + getStartDay(year, month)) % 7 == 1)
                System.out.println();

        }
    }

    //Ham in lich
    public static void printfMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }
}