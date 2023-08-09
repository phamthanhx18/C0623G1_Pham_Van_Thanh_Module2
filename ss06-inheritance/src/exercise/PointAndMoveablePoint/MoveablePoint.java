package exercise.PointAndMoveablePoint;

public class MoveablePoint extends Point {
    float xSpeed;
    float ySpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.setxSpeed(xSpeed);
        this.setySpeed(ySpeed);
    }

    public float[] getSpeed() {
        float[] arraySpeed = {this.getxSpeed(), this.getySpeed()};
        return arraySpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{"+
                "x=" + this.getX() +
                ", y=" + this.getY() +
                ", xSpeed=" + this.xSpeed +
                ", ySpeed=" + this.ySpeed +
                '}';
    }

    public MoveablePoint move() {
        this.setX(this.getX() + this.xSpeed);
        this.setY(this.getY() + this.ySpeed);
        return this;
    }
}
