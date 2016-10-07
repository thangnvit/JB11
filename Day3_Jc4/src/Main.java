import org.thangnv.ManageStudent.ManageStudent;
import org.thangnv.Student.Student;
import org.thangnv.Student.StudentDataAccess;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DEV on 8/26/2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ManageStudent manageStudent = new ManageStudent(new ArrayList<Student>());
        Student student = new Student("Thang","22/11/1996","1481310061",2,"Ha Noi");
        Student student1 = new Student("Nam","1/1/1994","1481310061",4,"Ha Noi");
        manageStudent.addStudent(student);
        manageStudent.addStudent(student1);
        StudentDataAccess studentDataAccess = new StudentDataAccess();
        studentDataAccess.writeToBinaryFile(manageStudent.getStudents());
        System.out.println("Doc file binary");
        List<Student>students = studentDataAccess.readFromBinaryFil("D:\\dev\\project\\activestudy\\JB11\\ListStudent.txt");
        for (Student student2 : students) {
            System.out.println(student);
        }
        studentDataAccess.writeToTextFile(manageStudent.getStudents());
        List<Student> students2=  studentDataAccess.readFromTextFile("D:\\input.txt");
        for (Student student2 : students2) {
            System.out.println(student);
        }

    }
}
