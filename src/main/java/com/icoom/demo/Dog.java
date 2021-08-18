package com.icoom.demo;

public class Dog extends Animal{

    private  int id;
    private  String colour;

    public void move() {
        System.out.println("子移动");
    }
    public void bark(){
        System.out.println("叫");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
