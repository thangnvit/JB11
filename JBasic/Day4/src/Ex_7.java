
import java.util.Scanner;
import java.util.StringJoiner;

public class Ex_7 {
    public static void main(String[] args) {
        String s = "ABCDDCDA";
        System.out.println(checkString(s));
    }

    public static boolean checkString(String s) {
        boolean check =true;
        for (int i = 0; i < (s.length() / 2); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i-1)) {
                check = false;
            }
        }
        return check;
    }
}