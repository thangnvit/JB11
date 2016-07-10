import java.util.Scanner;

/**
 * Created by DEV on 7/8/2016.
 */
import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student[] students = new Student[3];
        students[0] = new Student("Nguyen Van A", "1481310065", "22/11/1996", "HN");
        students[1] = new Student("Nguyen Van B", "1481310011", "22/11/1996", "HN");
        students[2] = new Student("Nguyen Van C", "1481310009", "22/11/1996", "HN");
        ManageStudent mngStudent = new ManageStudent(students);
        System.out.println("1.Xem danh sách");
        System.out.println("2.Tìm kiếm ");
        System.out.println("3.Thêm sinh viên");
        System.out.println("4.Thay đổi thông tin sinh viên");
        System.out.println("5.Xóa");
        System.out.println("0.Thoát");
        int choose;
        System.out.println("Nhập vào lựa chọn:");
        choose = scan.nextInt();
            String studentCode;
            switch (choose) {
                case 1:
                    mngStudent.showListStudent();
                    break;
                case 2:
                    System.out.println("Mời bạn nhập vào mã sinh viên của sinh viên cần tìm:");
                    scan.nextLine();
                    studentCode = scan.nextLine();
                    int index = mngStudent.searchStudentByStudentCode(studentCode);
                    students[index].showStudent();
                    break;
                case 3:
                    System.out.println("Mời bạn nhập vào thông tin sinh viên cần thêm:");
                    Student student = new Student();
                    student.setStudent();
                    mngStudent.addStudent(student);
                    System.out.println("Danh sách sau khi thêm:");
                    mngStudent.showListStudent();
                    break;
                case 4:
                    System.out.println("Mời bạn nhập vào mã sinh viên của sinh viên cần thay đổi thông tin:");
                    scan.nextLine();
                    studentCode = scan.nextLine();
                    mngStudent.editStudent(studentCode);
                    System.out.println("Danh sách sau khi sửa:");
                    mngStudent.showListStudent();
                    break;
                case 5:
                    System.out.println("Mời bạn nhập vào mã sinh viên của sinh viên cần xóa:");
                    scan.nextLine();
                    studentCode = scan.nextLine();
                    mngStudent.deleteStudent(studentCode);
                    System.out.println("Danh sách sau khi xóa:");
                    mngStudent.showListStudent();
                    break;
                default:
                    System.out.println("Cám ơn bạn");
            }
    }
}