package exercise.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number A:");
        double numberA = scanner.nextDouble();
        System.out.print("Enter number B:");
        double numberB = scanner.nextDouble();
        System.out.print("Enter number C:");
        double numberC = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(numberA , numberB, numberC);
        if (equation.getDiscriminant() > 0) {
            System.out.println("The equation has two roots: r1 = " + equation.getRoot1() + ", r2 = " + equation.getRoot2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.println("The equation has one root: r1 = r2 = " + equation.getRoot1());
        } else {
            System.out.println("The equation has no root");
        }
    }
}
