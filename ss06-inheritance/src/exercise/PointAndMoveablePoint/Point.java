package exercise.PointAndMoveablePoint;

public class Point {
    private float x;
    private float y;

    public Point () {}

    public Point (float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    public float [] getXY() {
        float [] arrayXY = {this.getX(),this.getY()};
        return arrayXY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                '}';
    }
}
