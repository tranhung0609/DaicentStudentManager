package com.daicent.model;

import java.util.*;

public class Student {

    private ArrayList<Student> students;

    private String name;
    private int age;
    private double avgScore;

    private Clazz clazz;

    public Student(Clazz clazz) {
        this.clazz = clazz;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }



    public Student(String name, Clazz clazz, int age, double avgScore) {
        this.name = name;
        this.clazz = clazz;
        this.age = age;
        this.avgScore = avgScore;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return '\n' +
                ", Name='" + name + '\'' +
                ", Age=" + age +
                ", AvgScore=" + avgScore +  "," + "Class : " + this.clazz +
                ", " +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.avgScore, avgScore) == 0 && Objects.equals(students, student.students) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students, name, age, avgScore);
    }

    public static void main(String[] args) {
    }

    private static <K, V> List<V> createListFromMapEntries(Map<K, V> map) {
        return new ArrayList<>(map.values());
    }
}
