/**
 * Created by DEV on 7/9/2016.
 */
public class ManageStudent {
    private Student[] students = new Student[0];

    public ManageStudent(Student[] students) {
        this.students = students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void sortListStudent() {
        for (int i = 0; i < students.length; i++)
            for (int j = i + 1; j < students.length; j++) {
                if ((students[i].compareStudent(students[j]) > 0)) {
                    Student temp = new Student();
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
    }

    public void addStudent(Student student) {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = new Student();
            newStudents[i] = students[i];
        }
        newStudents[students.length] = new Student();
        newStudents[students.length] = student;
        setStudents(newStudents);
    }

    public int searchStudentByStudentCode(String studentCode) {
        for (int i = 0; i < students.length; i++)
            if (students[i].searchStudentByStudentCode(studentCode)) {
                return i;
            }
        return 0;
    }

    public void deleteStudent(String studentCode) {
        int index = searchStudentByStudentCode(studentCode);
        for (int i = index; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }
        Student[] newStudents = new Student[students.length - 1];
        for (int i = 0; i < newStudents.length; i++) {
            newStudents[i] = new Student();
            newStudents[i] = students[i];
        }
        setStudents(newStudents);
    }

    public void editStudent(String studentCode) {
        int index = searchStudentByStudentCode(studentCode);
        students[index].setStudent();
    }

    public void showListStudent() {
        sortListStudent();
        for (int i = 0; i < students.length; i++) {
            System.out.println("Sinh viên thứ " + (i+1)+":");
            students[i].showStudent();
            System.out.println("------------------------");
        }
    }
}
