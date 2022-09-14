package com.daicent.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

public class Student {

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
}
