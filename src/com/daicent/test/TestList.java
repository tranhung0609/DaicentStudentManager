package com.daicent.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestList {

    private int id;
    private String name;
    private String address;

    public TestList(int id, String name1, String address1) {
        this.id = id;
    }

    public TestList(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public TestList() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "TestList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<TestList> customers = new ArrayList<>();
        customers.add(new TestList(1, "name1", "address1"));
        customers.add(new TestList(2, "name2", "address1"));
        customers.add(new TestList(3, "name3", "address2"));
        customers.add(new TestList(4, "name4", "address2"));
        customers.add(new TestList(5, "name5", "address3"));
        customers.add(new TestList(6, "name6", "address3"));

    }
}

