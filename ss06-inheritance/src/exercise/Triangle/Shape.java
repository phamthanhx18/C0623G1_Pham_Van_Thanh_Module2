package exercise.Triangle;

public class Shape {
    private String color;

    public Shape() {
        color = "red";
    }

    public Shape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Color: " + color;
    }
}
