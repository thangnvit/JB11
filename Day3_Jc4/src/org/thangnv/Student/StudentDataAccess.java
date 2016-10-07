package org.thangnv.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DEV on 8/26/2016.
 */
public class StudentDataAccess {

    public static void writeToBinaryFile(List<Student> studentList) {
        File inputFile = new File("ListStudent.txt");
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(inputFile));
            outputStream.writeObject(studentList);
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readFromBinaryFil(String path) {
        File outFile = new File(path);
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(outFile));
            List<Student> students = (List<Student>) inputStream.readObject();
            inputStream.close();
            return students;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeToTextFile(List<Student> studentList) {
        File outputFile = new File("TextOutput.txt");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile));
            String buffer;
            buffer = studentList.toString();
            bufferedWriter.write(buffer);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readFromTextFile(String path) {
        File inputFile = new File(path);
        List<Student> studentList = new ArrayList<Student>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            String studentData;
            while ((studentData = bufferedReader.readLine()) != null) {
                String[] studentAttributes = studentData.split(";");
                String name = studentAttributes[0];
                String birthDay = studentAttributes[1];
                String studentsId  = studentAttributes[2];
                String address = studentAttributes[3];
                studentList.add(new Student(name,birthDay,studentsId,address));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }

}
