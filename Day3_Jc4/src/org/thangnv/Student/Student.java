package org.thangnv.Student;

import java.io.Serializable;

/**
 * Created by DEV on 8/26/2016.
 */
public class Student implements Serializable {
    private String name;
    private String birthday;
    private String studentId;
    private String address;
    private int scores;

    public Student() throws Exception {
            throw new Exception("Sinh Vien khong co du lieu");
    }


    public Student(String name, String birthday, String studentId, String address) {
        this.name = name;
        this.birthday = birthday;
        this.studentId = studentId;
        this.address = address;
    }

    public Student(String address) {
        this.address = address;
    }

    public Student(String name, String birthday, String studentId, int scores, String address) {
        this.name = name;
        this.birthday = birthday;
        this.studentId = studentId;
        this.scores = scores;
        this.address = address;
    }

    public int getScores() {
        return scores;
    }

    public String getAddress() {
        return address;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public boolean isStudentId(String studentId){
        if(this.studentId.equals(studentId))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Student Id:" + getStudentId() +  ";Name:" + getName() + ";Birthday:" + getBirthday() + ";Address:" + getAddress() + ";Scores:" + getScores();
    }
}
