package com.daicent.modelmanager;

import com.daicent.exception.ExceptionHandling;
import com.daicent.model.Student;
import com.daicent.write_read_file.FileCsv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {

    public static final String STUDENT_FILEPATH = "src/com/daicent/filedata/student.csv";

    private List<Student> studentList = new ArrayList<>();
    FileCsv fileCsv = new FileCsv();
    ExceptionHandling exceptionHandling = new ExceptionHandling();
    Scanner scanner = new Scanner(System.in);

    public StudentManager() throws Exception {
        studentList = fileCsv.readFileStudent(studentList, STUDENT_FILEPATH);
    }

    public List<Student> getStudentList(){
        return studentList;
    }
}
