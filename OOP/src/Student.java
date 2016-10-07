/**
 * Created by DEV on 7/13/2016.
 */
public class Student extends Human{
    private String ngheNghiep;
    private long tienPhat;

    public Student(String name,int age, String ngheNghiep) {
        super(name,age);
        this.ngheNghiep = ngheNghiep;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public long getTienPhat() {
        return tienPhat;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public void setTienPhat(long tienPhat) {
        this.tienPhat = tienPhat;
    }

    public void diMuon(){
        tienPhat = tienPhat+10;
    }
    public String gioiThieu(){

        return ("Toi ten la:" + getName() + "\n" + "Tuoi: " + getAge() +"\n"+"Nghe nghiep:"+getNgheNghiep()+"\n"+"Tien phat:"+getTienPhat());
    }
}
