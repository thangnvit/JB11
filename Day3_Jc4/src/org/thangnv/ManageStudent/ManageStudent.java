package org.thangnv.ManageStudent;

import org.thangnv.Student.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DEV on 8/26/2016.
 */
public class ManageStudent {
    private List<Student> students = new ArrayList<Student>();

    public ManageStudent(List<Student> students) {
        this.students = students;
    }

    public boolean addStudent(Student student) {
        if (students.add(student))
            return true;
        return false;
    }

    public boolean removeStudents(Student student) {
        if (students.remove(student))
            return true;
        return false;
    }

    public boolean editStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId().equals(student.getStudentId())) {
                students.get(i).setName(student.getName());
                students.get(i).setAddress(student.getAddress());
                students.get(i).setBirthday(student.getBirthday());
                students.get(i).setScores(student.getScores());
                students.get(i).setStudentId(student.getStudentId());
                return true;
            }
        }
        return false;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "ManageStudent{" +
                "students=" + students +
                '}';
    }
}
