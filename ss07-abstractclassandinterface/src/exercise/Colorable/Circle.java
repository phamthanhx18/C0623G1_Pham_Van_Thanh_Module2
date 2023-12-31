package exercise.Colorable;

public class Circle extends Shape implements Colorable {
    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        this.howToColor();
        return "Circle{" +
                "\nColor=" + this.getColor() +
                "\nisFilled=" + this.isFilled() +
                "\nRadius=" + this.getRadius() +
                "\nArea=" + this.getArea() +
                "\nPerimeter=" + this.getPerimeter() +
                "}\n";
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
