package Ex_2;

public class Account extends Date{
    private int id;
    private double sodu;
    private double laiSuatNam;
    private Date ngayTao;

    public Account() {
        super();
    }

    public int getId() {
        return id;
    }

    public double getSodu() {
        return sodu;
    }

    public double getLaiSuatNam() {
        return laiSuatNam;
    }

    public Date getNgayTao() {
        return ngayTao;
    }
    public void in(){
        System.out.println(getId());
        System.out.println(getLaiSuatNam());
        System.out.println(getSodu());
        System.out.println("ngay tao:"+getNgayTao());
    }
}
