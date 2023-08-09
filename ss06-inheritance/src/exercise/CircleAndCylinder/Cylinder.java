package exercise.CircleAndCylinder;

public class Cylinder extends Circle {
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVolume() {
        return this.getArea() * this.getHeight();
    }

    @Override
    public String toString() {
        return "Info Cylinder" + "\n" +
                "Radius: " + this.getRadius() + "\n" +
                "Color: " + this.getColor() + "\n" +
                "Volume: " + this.getVolume() + "\n";
    }
}
