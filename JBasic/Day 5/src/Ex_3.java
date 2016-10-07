import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number;
        System.out.println("Nhap ma the can check");
        number = scan.nextLong();
        if (isValid(number))
            System.out.println("Ma the hop le");
        else
            System.out.println("Ma the khong hop le");

    }

    /*    //Ham kiem tra so the dung hay sai
        public static boolean isValid(long number) {
            int temp = 0;
            int count = 0;
            while (number != 0) {
                temp = (int) (number % 100);
                number /= 100;
                count++;

            }
            if (count > 6 && count <= 8 && (temp == 37 || (temp > 59 && temp < 70) || (temp > 39 && temp < 50) || (temp > 49 && temp < 60)))
                return true;
            else
                return false;
        }
      */
    //Ham tra ve chu so cua 1 so nguyen
    public static int getSize(long number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count++;
    }

    //Ham tra ve n chu so dau tien
    public static int getPerfix(long number, int n) {
        long numberOfDigit = 1;
        int temp = 0;
        for (int i = 0; i < (getSize(number) - n); i++) {
            numberOfDigit = numberOfDigit * 10;
        }
        while (number != 0) {
            temp = (int) (number % numberOfDigit);
            number = number / numberOfDigit;
        }
        return temp;
    }

    //Ham kiem tra chu so bat dau cua the
    public static boolean isRightPerfix(long number) {
        return (getPerfix(number, 1) == 4 || getPerfix(number, 1) == 5 || getPerfix(number, 1) == 6 || getPerfix(number, 2) == 37);
    }

    //Ham tinh tong cac chu so cua 1 so
    public static int getDigit(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    //Ham tinh tong cac chu so o vi tri chan X2
    public static int sumOfDoubleEvenPlace(long number) {
        int indexOfDigit = 1;
        int digit = 0;
        int sum = 0;
        while (number != 0) {
            digit = (int) (number % 10);
            if (indexOfDigit % 2 == 0) {
                if ((digit * 2) > 9) {
                    digit = getDigit(digit * 2);
                    sum += digit;
                } else {
                    sum += digit * 2;
                }
            }
            indexOfDigit++;
            number = number / 10;
        }
        return sum;
    }

    //Ham tinh tong cac chu so o vi tri le
    public static int sumOfOddPlace(long number) {
        int indexOfDigit = 1;
        int sum = 0;
        while (number != 0) {
            if (indexOfDigit % 2 != 0) {
                sum += number % 10;
            }
            indexOfDigit++;
            number = number / 10;
        }
        return sum;
    }

    //Ham kiem tra ma the
    public static boolean isValid(long number) {
        int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        if (getSize(number) > 12 && getSize(number) < 17 && isRightPerfix(number)) {
            if (sum % 10 == 0)
                return true;
        }
        return false;
    }
}
