package com.daicent.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

public class Student implements Comparable<Student> {

    private ArrayList<Student> students;

    private String name;
    private int age;
    private double avgScore;

    public Student() {
    }


    public Student(String name, int age, double avgScore) {
        this.name = name;
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
                ", AvgScore=" + avgScore +
                '}';
    }


    public void sortByPointAscen() {
        Collections.sort(this.students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAvgScore() < o2.getAvgScore()){
                    return 1;
                } else if (o1.getAvgScore()>o2.getAvgScore()) {
                    return -1;
                }
                return 0;
            }
        });
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }
}
