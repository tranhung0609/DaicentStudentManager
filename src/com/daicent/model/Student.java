package com.daicent.model;

public class Student {
    private int id;

    private String name;

    private int age;

    private double avgScore;

    public Student(String s, int i, double v) {
    }

    public Student(int id, String name, int age, double avgScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.avgScore = avgScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", avgScore=" + avgScore +
                '}';
    }
}
