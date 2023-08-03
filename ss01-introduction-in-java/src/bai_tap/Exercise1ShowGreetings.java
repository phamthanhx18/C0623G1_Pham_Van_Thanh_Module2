package bai_tap;

import java.util.Scanner;

public class Exercise1ShowGreetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name  = input.nextLine();
        System.out.println("Hello: " + name);
    }
}
