package exercise.ResizeableClassShape;

class Rectangle extends Shape implements Resizeable {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void resize(double percent) {
        this.setLength(this.length *= (1 + (percent / 100)));
        this.setWidth(this.width *= (1 + (percent / 100)));
    }

    @Override
    public String toString() {
        return "Rectangle { length = " + this.getLength() + ", width = " + this.getWidth() + " }";
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }
}
