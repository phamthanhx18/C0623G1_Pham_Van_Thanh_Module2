package exercise.Fan;

import java.lang.String;
public class ClassFan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean status;
    private double radius;
    private String color;

    public ClassFan(int speed, boolean status, double radius, String color) {
        if (speed == 1) {
            this.speed = SLOW;
        } else if (speed == 2){
            this.speed = MEDIUM;
        } else {
            this.speed = FAST;
        }
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    private String getSpeed() {
        String result = "";
        if (speed==1) {
            result += "Tốc độ chậm";
        } else if (speed==2) {
            result += "Tốc độ trung bình";
        } else {
            result += "Tốc độ nhanh";
        }
        return result;
    }

    private boolean isStatus() {
        return status;
    }

    private double getRadius() {
        return radius;
    }

    private String getColor() {
        return color;
    }

    public void turnOn(boolean status) {
        this.status = status;
    }

    public String toString() {
        if (this.isStatus()) {
            return "Speed: " + this.getSpeed() + "\n" +
                    "Color: " + this.getColor() + "\n" +
                    "radius : " + this.getRadius() + "\n" +
                    "Fan is on";
        } else {
            return "Color: " + this.getColor() + "\n" +
                    "radius : " + this.getRadius() + "\n" +
                    "Fan is Off";
        }
    }
}
