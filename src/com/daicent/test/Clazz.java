package com.daicent.test;

import java.util.List;

public class Clazz {
    private int id;
    private String name;

    private List<Clazz> listClazz;

    public Clazz(List<Clazz> listClazz) {
        this.listClazz = listClazz;
    }

    public List<Clazz> getListClazz() {
        return listClazz;
    }

    public void setListClazz(List<Clazz> listClazz) {
        this.listClazz = listClazz;
    }

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
}
