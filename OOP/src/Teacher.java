/**
 * Created by DEV on 7/13/2016.
 */
public class Teacher extends Human {
    private String thamNien;
    private String nnGiangDay;

    public Teacher(String name,int age,String thamNien, String nnGiangDay) {
        super(name,age);
        this.thamNien = thamNien;
        this.nnGiangDay = nnGiangDay;
    }

    public void setThamNien(String thamNien) {
        this.thamNien = thamNien;
    }

    public void setNnGiangDay(String nnGiangDay) {
        this.nnGiangDay = nnGiangDay;
    }

    public String getThamNien() {
        return thamNien;
    }

    public String getnnGiangDay() {
        return nnGiangDay;
    }

    public String gioiThieu(){

        return ("Toi ten la:" + getName() + "\n" + "Tuoi: " + getAge() +"\n"+"Nghe nghiep:"+getThamNien()+"\n"+"Tien phat:"+getnnGiangDay());
    }
}
