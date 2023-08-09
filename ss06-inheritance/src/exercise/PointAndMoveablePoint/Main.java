package exercise.PointAndMoveablePoint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(5, 5);
        System.out.println(point);

        point.setX(10);
        point.setY(10);
        System.out.println(point);

        point.setXY(15,30);
        System.out.println(point);

        float [] arrayPoint = point.getXY();
        System.out.println(Arrays.toString(arrayPoint));

        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(5,7);
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(3,5,5,7);
        System.out.println(moveablePoint);

        moveablePoint.setSpeed(20,30);
        System.out.println(moveablePoint);

        float [] arrayGet = moveablePoint.getSpeed();
        System.out.println(Arrays.toString(arrayGet));

        moveablePoint = moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
