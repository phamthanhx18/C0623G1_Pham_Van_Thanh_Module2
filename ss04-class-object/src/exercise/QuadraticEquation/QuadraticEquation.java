package exercise.QuadraticEquation;

import java.lang.String;

public class QuadraticEquation {
    double numberA;
    double numberB;
    double numberC;

    public QuadraticEquation(double numberA, double numberB, double numberC) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }

    public double getNumberA() {
        return numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public double getNumberC() {
        return numberC;
    }

    public String getDiscriminant() {
        double delta = (Math.pow(this.getNumberB(), 2) - 4 * this.getNumberA() * this.getNumberC());
        if (delta < 0) {
            return "The equation has no roots";
        } else if (delta == 0) {
            return "Phuong trinh co 2 nghiem x1 = x2 la " + (-this.getNumberB() / (2 * this.getNumberA()));
        } else {
            return "Phuong trinh co 2 nghiem x1 la " + ((-this.getNumberB() + Math.sqrt(delta)) / (2 * this.getNumberA())) +
                    " x2 la " + ((-this.getNumberB() - Math.sqrt(delta)) / (2 * this.getNumberA()));
        }
    }
}
