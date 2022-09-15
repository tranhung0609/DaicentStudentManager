package com.daicent.model;

import java.util.*;
import java.util.stream.Collectors;

public class Classes {
    private Clazz clazz;
    private Student student;
    private int id;

    public Classes(Clazz clazz, Student student, int id) {
        this.clazz = clazz;
        this.student = student;
        this.id = id;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "clazz=" + clazz +
                ", student=" + student +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classes classes = (Classes) o;
        return id == classes.id && clazz.equals(classes.clazz) && student.equals(classes.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clazz, student, id);
    }

    public static void main(String[] args) {
//        Map<Integer, Student> map = new HashMap<>();
//        Student student = new Student("abc", 22, 4);
//        Student student1 = new Student("abcsd", 23, 5);
//        Student student2 = new Student("abcsgxc", 24, 6);
//        map.put(1, student);
//        map.put(2, student1);
//        map.put(3, student2);
//        List<Student> result = createListFromMapEntries(map);
//
//        result.forEach(System.out :: println);
    }

    private static <Clazz, Student>  List<Student> createListFromMapEntries (Map<Clazz, Student> map){
        return map.values().stream().collect(Collectors.toList());
    }


}
