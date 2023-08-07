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
        System.out.println(equation.getDiscriminant());
    }
}
