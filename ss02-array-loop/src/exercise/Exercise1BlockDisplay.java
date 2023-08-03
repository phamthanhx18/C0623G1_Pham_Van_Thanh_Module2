package exercise;

import java.util.Scanner;

public class Exercise1BlockDisplay {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j >= i; j--) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <=5; j++) {
                            if (i>j) {
                                System.out.print("   ");
                            } else {
                                System.out.print(" * ");
                            }
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 5; j >=1; j--) {
                            if (i<j) {
                                System.out.print("   ");
                            } else {
                                System.out.print(" * ");
                            }
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5-i; j++) {
                            System.out.print("   ");
                        }
                        for (int k = 1; k <= 2*i-1; k++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}