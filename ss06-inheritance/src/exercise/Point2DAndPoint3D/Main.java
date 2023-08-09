package exercise.Point2DAndPoint3D;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(5,10);
        System.out.println(point2D);


        point2D.setXY(3,5);
        System.out.println(point2D);


        float [] arrayPoint2D = point2D.getXY();
        System.out.println(Arrays.toString(arrayPoint2D));


        Point3D point3D = new Point3D();
        point3D.setXYZ(3,5, 9);
        System.out.println(point3D);

        float [] arrayPoint3D = point3D.getXYZ();
        System.out.println(Arrays.toString(arrayPoint3D));


        point3D = new Point3D(10,20,30);
        System.out.println(point3D);
        point3D.setXYZ(10,55,99);
        System.out.println(point3D);
    }
}
