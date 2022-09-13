package com.daicent.main;

import com.daicent.model.Clazz;
import com.daicent.model.Grade;
import com.daicent.model.Student;
import com.daicent.model.Subject;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        List<Clazz> clazzList = new ArrayList<>();
        List<Grade> gradeList = new ArrayList<>();
        List<Subject> subjectList = new ArrayList<>();
        Map<Grade, List<Student>> gradeListMap = new HashMap<>();
        Student student1 = new Student( "Hưng", 24, 5.5);
        Student student2 = new Student("Thuận", 54, 5);
        Student student3 = new Student( "Sơn", 44, 4.6);
        Student student4 = new Student( "Hoa", 64, 3);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        System.out.println(studentList);

        Grade grade1 = new Grade(1,"A");
        Grade grade2 = new Grade(2,"B");

        List<Student> studentList1 = Arrays.asList(student1, student2);
        gradeListMap.put(grade1, studentList1);
        System.out.println(gradeListMap);
    }
}
