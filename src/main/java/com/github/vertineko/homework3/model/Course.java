package com.github.vertineko.homework3.model;

public class Course {
    private int num;
    private String name;

    public Course(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getId() {
        return num;
    }

    public void setId(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
