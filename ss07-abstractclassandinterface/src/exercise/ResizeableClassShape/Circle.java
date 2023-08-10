package exercise.ResizeableClassShape;

class Circle extends Shape implements Resizeable {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        setRadius(radius *= (1 + (percent / 100)));
    }

    @Override
    public String toString() {
        return "Circle { radius = " + this.getRadius() + " }";
    }
    @Override
    public double getArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }
}
