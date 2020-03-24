package com.company;

import java.util.Scanner;

class Student {
    private String name;
    private double rating;

    Student() {
        this.name = "Noname";
        this.rating = 0.0D;
    }

    Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public String toString() {
        return "Student: " + this.name + "\nRating= " + this.rating;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return this.rating;
    }

}
