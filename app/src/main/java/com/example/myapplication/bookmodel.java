package com.example.myapplication;

public class bookmodel {
    private String name ;
    private String type ;

    public bookmodel(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}

