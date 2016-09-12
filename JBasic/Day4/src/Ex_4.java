import java.util.Scanner;

public class Ex_4 {
    Scanner scan = new Scanner(System.in);
    private float bmi;
    private float weight;
    private float height;

    public void inPut() {
        System.out.println("Nhap chieu cao");
        height = scan.nextFloat();
        System.out.println("Nhap can nang:");
        weight = scan.nextFloat();
    }

    public float BMI() {
        bmi = weight / (height * height);
        return bmi;
    }

    public void outPut() {
        if (BMI() < 18.5) {
            System.out.println("Thieu can");
        } else if (BMI() < 25) {
            System.out.println("ly tuong");
        } else if (BMI() <= 30) {
            System.out.println("Thua can");
        } else
            System.out.println("bep phi");

    }

    public static void main(String[] args) {
        Ex_4 ex4 = new Ex_4();
        Scanner scan = new Scanner(System.in);
        String a;
        do {
            ex4.inPut();
            ex4.outPut();
            System.out.println("Ban co muon nhap tiep ko:");
            System.out.println("1:Co");
            System.out.println("2:Khong");
            a = scan.nextLine();
        } while (a.equals("Y"));

    }
}
