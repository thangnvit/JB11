package Ex_2;

public class Account {
    private int id;
    private double sodu;
    private double laiSuatNam;
    private Date ngayTao = new Date();
    ;

    public Account() {
    }

    public Account(int id, double sodu) {
        this.id = id;
        this.sodu = sodu;
    }

    public void setId(int id) {
        if (id > 0)
            this.id = id;
    }

    public void setSodu(double sodu) {
        if (id > 0)
            this.sodu = sodu;
    }

    public void setLaiSuatNam(double laiSuatNam) {
        if (id > 0)
            this.laiSuatNam = laiSuatNam;
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

    public double getLaiSuatThang() {
        return laiSuatNam / 12;
    }

    public double getLoiNhuanHangThang() {
        return sodu * getLaiSuatThang();
    }

    public void rutTien(double value) {
        sodu = sodu - value;
    }

    public void napTien(double value) {
        sodu = sodu + value;
    }

    public String toString() {
        return "Acount co id la: " + getId() + "\n" + "so du:" + getSodu() + "\nLoi nhuan thang:" + getLoiNhuanHangThang() + "\nNgay tao:" + getNgayTao();
    }

}
