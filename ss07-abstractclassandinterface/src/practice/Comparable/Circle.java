package practice.Comparable;

public class Circle {
    private double radius;
    private String color;
    private boolean filled;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return Math.pow(getRadius(), 2) * 3.14;
    }

    @Override
    public String toString() {
        return "Info Circle" + "\n" +
                "Radius: " + this.getRadius() + "\n" +
                "Filled: " + this.isFilled() + "\n" +
                "Color: " + this.getColor() + "\n" +
                "Area: " + this.getArea() + "\n";
    }
}
