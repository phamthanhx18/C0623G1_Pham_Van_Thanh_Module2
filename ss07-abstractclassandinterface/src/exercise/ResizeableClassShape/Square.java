package exercise.ResizeableClassShape;

class Square extends Shape implements Resizeable {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    Square(double side) {
        this.side = side;
    }

    @Override
    public void resize(double percent) {
        this.setSide(this.side *= (1 + (percent / 100)));
    }

    @Override
    public String toString() {
        return "Square { side = " + this.getSide() + " }";
    }

    @Override
    public double getArea() {
        return this.getSide() * this.getSide();
    }
}
