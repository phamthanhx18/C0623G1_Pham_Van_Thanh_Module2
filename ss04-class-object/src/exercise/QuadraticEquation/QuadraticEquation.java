package exercise.QuadraticEquation;

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

    public double getDiscriminant() {
        double delta = Math.pow(this.getNumberB(), 2) - (4 * this.getNumberA() * this.getNumberC());
        return delta;
    }

    public double getRoot1() {
        if (this.getDiscriminant() >= 0) {
            double r1 = (-this.getNumberB() + Math.sqrt(this.getDiscriminant())) / (2 * this.getNumberA());
            return r1;
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (this.getDiscriminant() >= 0) {
            double r2 = (-this.getNumberB() - Math.sqrt(this.getDiscriminant())) / (2 * this.getNumberA());
            return r2;
        } else {
            return 0;
        }
    }
}
