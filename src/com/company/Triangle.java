package com.company;

public class Triangle extends Shape {

    protected Point A, B, C;

    public Triangle() {}

    public Triangle(Point A, Point B, Point C) {
        this.A = A; this.B = B; this.C = C;
    }

    public Triangle(Point A, Point B, Point C, String color, boolean filled) {
        super(color, filled);
        this.A = A; this.B = B; this.C = C;
    }

    public Point getA() { return this.A; }
    public void setA(Point A) { this.A = A; }

    public Point getB() { return this.B; }
    public void setB(Point B) { this.B = B; }

    public Point getC() { return this.C; }
    public void setC(Point C) { this.C = C; }

    @Override
    public double getArea() {

        Vector2d abSide = new Vector2d(A,B);
        Vector2d acSide = new Vector2d(A,C);

        double vecAngleSin = Math.sin( abSide.getAngleWithVec(acSide) );

        return abSide.length() * acSide.length() * vecAngleSin / 2.0;

    }

    @Override
    public double getPerimeter() {

        Vector2d abSide = new Vector2d(A,B);
        Vector2d acSide = new Vector2d(A,C);
        Vector2d bcSide = new Vector2d(B,C);

        return abSide.length() + acSide.length() + bcSide.length();

    }

    @Override
    public String toString() {
        return "triangle ad this properties:\n"
                + "A(" + this.A.getX() + ", " + this.A.getY() + ")\n"
                + "B(" + this.B.getX() + ", " + this.B.getY() + ")\n"
                + "C(" + this.C.getX() + ", " + this.C.getY() + ")\n"
                + "Area: " + this.getArea() + "\n"
                + "Perimetr: " + this.getPerimeter();
    }

}