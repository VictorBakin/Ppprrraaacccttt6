package com.company;


public class MovableRectangle extends Rectangle implements Moving {

    protected MovablePoint leftTopPoint;
    protected MovablePoint rightBotPoint;

    public MovableRectangle() {}

    public MovableRectangle(MovablePoint leftTopPoint, MovablePoint rightBotPoint) {
        this.leftTopPoint = leftTopPoint; this.rightBotPoint = rightBotPoint;
    }

    public MovableRectangle(MovablePoint leftTopPoint, MovablePoint rightBotPoint, String color, boolean filled) {
        this.color = color; this.filled = filled;
        this.leftTopPoint = leftTopPoint; this.rightBotPoint = rightBotPoint;
    }

    public MovablePoint getLeftTopPoint() { return this.leftTopPoint; }
    public void setLeftTopPoint(MovablePoint leftTopPoint) { this.leftTopPoint = leftTopPoint; }

    public MovablePoint getRightBotPoint() { return this.rightBotPoint; }
    public void setRightBotPoint(MovablePoint rightBotPoint) { this.rightBotPoint = rightBotPoint; }

    @Override
    public void move(Vector2d velocity) {
        this.leftTopPoint.move(velocity);
        this.rightBotPoint.move(velocity);
    }

    @Override
    public String toString() {
        return " movable rectangle "
                + "(" + this.leftTopPoint.getX() + ", " + this.leftTopPoint.getY() + ")"
                + "and end at (" + this.rightBotPoint.getX() + ", " + this.rightBotPoint.getY() + ")";
    }

}