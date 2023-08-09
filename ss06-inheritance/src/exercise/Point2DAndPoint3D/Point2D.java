package exercise.Point2DAndPoint3D;

public class Point2D {
    private float x;
    private float y;

    public Point2D () {

    }

    public Point2D (float x, float y) {
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
        float [] getXY = {this.getX(),this.getY()};
        return getXY;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                '}';
    }
}
