package exercise.CircleAndCylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5.0);
        circle.setColor("blue");

        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(5.0);
        cylinder.setColor("red");
        cylinder.setHeight(10);

        System.out.println(cylinder);

    }
}
