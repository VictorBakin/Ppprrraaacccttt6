package com.company;


public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }



    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }



    @Override
    public String toString() {
        return "RECTANGLE'S INFO:\nWIDTH: " + this.width + "\nLENGTH: " + this.length + "\nAREA: " + this.getArea()
                + "\nPERIMETER: " + this.getPerimeter();
    }

}