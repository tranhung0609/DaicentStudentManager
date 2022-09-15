package com.daicent.model;

import java.util.*;

public class Clazz {
    private int id;
    private String name;

    public Clazz(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Clazz() {
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

    @Override
    public String toString() {
        return "Clazz{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clazz clazz = (Clazz) o;
        return id == clazz.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

//    public static void main(String[] args) {
//        Clazz clazz = new Clazz(1, "abc");
//        Clazz clazz1 = new Clazz(2, "abc");
//        Clazz clazz2 = new Clazz(3, "abc");
//
//        Map<Clazz, String> m = new HashMap<>();
//        m.put(clazz, "abc");
//        m.put(clazz1, "abc");
//        m.put(clazz2, "abc");
//
//
//
//        Clazz clazz3 = new Clazz(3, "abcdfa");
//        m.put(clazz3, "bcbc");
//        System.out.println(m.size());
//
//        System.out.println(m.containsKey(clazz3));
//
//        Set<Clazz> a = new HashSet<>();
//        a.add(clazz1);
//        a.add(clazz2);
//        a.add(clazz3);
//        a.add(clazz);
//        System.out.println(a.size());
//    }

    public static void main(String[] args) {

    }
}
