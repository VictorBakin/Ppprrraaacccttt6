package com.company;

public class Point {

    protected double x;
    protected double y;

    public Point() {}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return this.x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return this.y; }
    public void setY(double y) { this.y = y; }

    @Override
    public String toString() {
        return " point and coordinates (" + this.x + ", " + this.y + ")";
    }

}