package com.daicent.model;

import java.util.Comparator;

public class Comparable implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAvgScore() > o2.getAvgScore()) {
            return -1;
        } else if (o1.getAvgScore() < o2.getAvgScore()) {
            return 1;
        }
        return 0;
    }
}
