package exercise.Point2DAndPoint3D;

public class Point3D extends Point2D {
    private float z;
    public Point3D () {

    }
    public Point3D (float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        this.setXY(x,y);
        this.setZ(z);
    }

    public float [] getXYZ() {
        float [] arrayXYZ = {this.getX(),this.getY(),this.getZ()};
        return arrayXYZ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                ", z=" + this.getZ() +
                '}';
    }
}
