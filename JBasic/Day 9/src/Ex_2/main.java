package Ex_2;
public class main {
    public static void main(String[] args) {
        Account ac = new Account(1122,20000);
        ac.setLaiSuatNam(4.5d);
        ac.rutTien(2500);
        ac.napTien(3000);
        System.out.println(ac.toString());

    }
}
