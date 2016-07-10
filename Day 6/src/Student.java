import java.util.Scanner;

/**
 * Created by DEV on 7/9/2016.
 */
public class Student {
    private String name;
    private String birthday;
    private String studentCode;
    private String address;
    private int scores;

    public Student() {
        name = null;
        birthday = null;
        studentCode = null;
        address = null;

    }

    public Student(String name, String studentCode, String birthday, String address) {
        this.name = name;
        this.studentCode = studentCode;
        this.birthday = birthday;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(String birthday) {
        this.birthday = birthday;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getBirthDay() {
        return birthday;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public String getAddress() {
        return address;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public int compareStudent(Student student) {
        return this.studentCode.compareTo(student.studentCode);
    }

    public boolean searchStudentByStudentCode(String studentCode) {
        return (this.studentCode == studentCode);
    }

    public void setStudent() {
        String name, studentCode, address, birthday;
        int scores;
        Scanner scan = new Scanner(System.in);
        System.out.println("Tên sinh viên:");
        name = scan.nextLine();
        setName(name);
        System.out.println("Mã sinh viên:");
        studentCode = scan.nextLine();
        setStudentCode(studentCode);
        System.out.println("Ngày sinh:");
        birthday = scan.nextLine();
        setBirthDay(birthday);
        System.out.println("Địa chỉ:");
        address = scan.nextLine();
        setAddress(address);
        System.out.println("Điểm số:");
        scores = scan.nextInt();
        setScores(scores);
    }

    public void showStudent() {
        System.out.println("Mã sinh viên:" + getStudentCode());
        System.out.println("Tên sv:" + getName());
        System.out.println("Ngày sinh:" + getBirthDay());
        System.out.println("Địa chỉ:" + getAddress());
        System.out.println("Điểm số:" + getScores());
//        System.out.println(getStudentCode()+"               "+ getName()+"           "+getAge()+"             "+getAddress()+"            "+getScores());
    }
}
