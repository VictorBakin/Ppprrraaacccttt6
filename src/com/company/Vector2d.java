package com.company;

import java.lang.Math;

public class Vector2d {

    protected Point origin;
    protected Point tip;

    public Vector2d() {}

    public Vector2d(Point origin, Point tip) {
        this.origin = origin;
        this.tip = tip;
    }

    public Point getOrigin() { return this.origin; }
    public void setOrigin(Point origin) { this.origin = origin; }

    public Point getTip() { return this.tip; }
    public void setTip(Point tip) { this.tip = tip; }

    public void addVector(Vector2d vec) {
        this.origin.x += vec.getOrigin().x;
        this.tip.x += vec.getTip().x;
    }

    public double length() {
        return Math.sqrt( Math.pow(this.tip.x - this.origin.x, 2) + Math.pow(this.tip.y - this.origin.y, 2) );
    }

    public double dotProduct(Vector2d vec) {
        return this.origin.x * vec.getOrigin().x  +  this.tip.x * vec.getTip().x;
    }

    public double getAngleWithVec(Vector2d vec) {
        double cos = this.dotProduct(vec) / ( this.length() * vec.length() );
        return Math.acos(cos);
    }

    @Override
    public String toString() {
        return "2d vector  (" + (this.tip.x - this.origin.x) + ", " + (this.tip.y - this.origin.y) + ")";
    }

}