package com.daicent.test;

import java.util.*;

public class Main {
    static Map<Student, List<Subject>> maplist = new HashMap<>();
    static Map<Clazz, List<Student>> clmap = new HashMap<>();
    public static void main(String[] args) {

        Student st1 = new Student(1, "Thuận");
        Student st2 = new Student(2, "Hưng");
        Student st3 = new Student(3, "Hoa");
        Subject sb1 = new Subject(1, "Toan", 9);
        Subject sb2 = new Subject(2, "Toan", 4);
        Subject sb3 = new Subject(3, "Toan", 9);
        List<Subject> s1 = new ArrayList<>();
        s1.add(sb1);
        List<Subject> s2 = new ArrayList<>();
        s2.add(sb2);
        List<Subject> s3 = new ArrayList<>();
        s3.add(sb3);
        maplist.put(st1, s1);
        maplist.put(st2, s2);
        maplist.put(st3, s3);
        Student st4 = new Student(4, "Hùng");
        Student st5 = new Student(5, "Sơn");
        Student st6 = new Student(6, "A Thuận Gia");
        Subject sb4 = new Subject(1, "Toan", 9);
        Subject sb5 = new Subject(2, "Toan", 9);
        Subject sb6 = new Subject(3, "Toan", 9);
        List<Subject> s4 = new ArrayList<>();
        s4.add(sb4);
        List<Subject> s5 = new ArrayList<>();
        s5.add(sb5);
        List<Subject> s6 = new ArrayList<>();
        s6.add(sb6);
        maplist.put(st4, s4);
        maplist.put(st5, s5);
        maplist.put(st6, s6);

        Clazz cl1 = new Clazz(1, "Daicent");
        Clazz cl2 = new Clazz(1, "Java");
        List<Student> stu1 = new ArrayList<>();
        stu1.add(st1);
        List<Student> stu2 = new ArrayList<>();
        stu2.add(st2);
        List<Student> stu3 = new ArrayList<>();
        stu3.add(st3);
        List<Student> stu4 = new ArrayList<>();
        stu4.add(st4);
        List<Student> stu5 = new ArrayList<>();
        stu5.add(st5);
        List<Student> stu6 = new ArrayList<>();
        stu6.add(st6);
        clmap.put(cl1, stu1);
        clmap.get(cl1).add(st2);
        clmap.get(cl1).add(st3);
        clmap.put(cl2, stu4);
        clmap.get(cl2).add(st5);
        clmap.get(cl2).add(st6);
        School a = new School(1, "a");
        Map<School, List<Clazz>> school = new HashMap<>();
        List<Clazz> c1 = new ArrayList<>();
        c1.add(cl1);
        List<Clazz> c2 = new ArrayList<>();
        c2.add(cl2);

        school.put(a, c1);
        school.get(a).add(cl2);
        System.out.println("High score Class: ");

        List<Student> list = new ArrayList<>();
        for (Clazz clazz : school.get(a)) {
            System.out.println("class " + clazz.getName());
            List<Student> tmp = getHighScoreClass(clazz);
            printList(tmp);
            list.addAll(tmp);
        }
        System.out.println("High score school: ");
        list = sortStudentByScore(list);
        for (Student student : list) {
            if (getMathScore(student) == getMathScore(list.get(0))) {
                System.out.println(student);
            }
        }
    }

    static void printList(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }

    static double getMathScore(Student a) {
        for (Subject subject : maplist.get(a)) {
            if (subject.getName() == "Toan") {
                return subject.getScore();
            }
        }
        return -1;
    }

    static List<Student> sortStudentByScore(List<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++)
                if (getMathScore(list.get(i)) < getMathScore(list.get(j))) {
                    Collections.swap(list, i, j);
                }
        }
        return list;
    }

    static List<Student> getHighScoreClass(Clazz a) {
        List<Student> studentList = new ArrayList<>();
        sortStudentByScore(clmap.get(a));
        for (Student student : clmap.get(a)) {
            if (getMathScore(student) == getMathScore(clmap.get(a).get(0))) {
                studentList.add(student);
            }
        }
        return studentList;
    }

}

