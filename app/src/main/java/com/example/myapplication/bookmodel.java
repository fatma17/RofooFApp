package com.example.myapplication;

public class bookmodel {
    private String name ;
    private String type ;
    private int image ;

    public bookmodel(String name, String type , int image ) {
        this.name = name;
        this.type = type;
        this.image = image ;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getImage() {
        return image;
    }

    public bookmodel(int image) {
        this.image = image;
    }
}

