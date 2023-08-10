package exercise.Colorable;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }


    public double getLength() {
        return length;
    }


    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "\nColor=" + this.getColor() +
                "\nisFilled=" + this.isFilled() +
                "\nwidth=" + this.getWidth() +
                "\nlength=" + this.getLength() +
                "\nArea=" + this.getArea() +
                "\nlength=" + this.getPerimeter() +
                "}\n";
    }
}
