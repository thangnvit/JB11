/**
 * Created by DEV on 7/13/2016.
 */
public class Student {
    private String name;
    private int age;
    private String job;
    private long forfeit;

    public Student() {
    }

    public Student(String name, String job, int age) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setForfeit(long forfeit) {
        this.forfeit = forfeit;
    }

    public String getName() {
        return name;
    }

    public long getForfeit() {
        return forfeit;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public void diMuon(){
        forfeit = forfeit +10;
    }
    public String gioiThieu(){
        return ("Em ten la:" + getName() + "\n" + "Tuoi: " + getAge() +"\n"+"Nghe nghiep:"+getJob()+"\n"+"Tien phat:"+getForfeit());
    }
}
