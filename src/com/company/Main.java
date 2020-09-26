package com.company;

public class Main {

    public static void main(String[] args) {

        Point vecOrigin = new Point(0,0);
        Point vecTip = new Point(4,4);

        Vector2d velocity = new Vector2d(vecOrigin, vecTip);

        MovablePoint a = new MovablePoint(1,5);
        MovablePoint b = new MovablePoint(5,1);

        MovableRectangle movRect = new MovableRectangle(a,b);

        System.out.println("left top: (" + movRect.getLeftTopPoint().getX() + ", " + movRect.getLeftTopPoint().getY() + ")");
        System.out.println("right bot: (" + movRect.getRightBotPoint().getX() + ", " + movRect.getRightBotPoint().getY() + ")");

        movRect.move(velocity);

        System.out.println("\n rectangle (x) = " + (velocity.getTip().x - velocity.getOrigin().x)
                + " AND Y = " + (velocity.getTip().y - velocity.getTip().x));

        System.out.println("displaced left top: (" + movRect.getLeftTopPoint().getX() + ", " + movRect.getLeftTopPoint().getY() + ")");
        System.out.println("displaced right bot: (" + movRect.getRightBotPoint().getX() + ", " + movRect.getRightBotPoint().getY() + ")");

    }

}