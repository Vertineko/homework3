package com.github.vertineko.homework3.model;

public class deshenpi {
    private int num;
    private String name;
    private int status;

    public deshenpi(int num, String name, int status) {
        this.num = num;
        this.name = name;
        this.status = status;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
