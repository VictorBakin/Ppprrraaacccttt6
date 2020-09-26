package com.company;

public class MovablePoint extends Point implements Moving {

    public MovablePoint() {}

    public MovablePoint(double x, double y) {
        super(x,y);
    }

    @Override
    public void move(Vector2d velocity) {
        this.x += velocity.getTip().x - velocity.getOrigin().x;
        this.y += velocity.getTip().y - velocity.getOrigin().y;
    }

    @Override
    public String toString() {
        return "movable point and coordinates + (" + this.x + ", " + this.y + ")";
    }

}