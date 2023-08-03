package exercise;

import java.util.Scanner;

public class Exercise2CurrencyConverter {
    public static void main(String[] args) {
        final int rate = 23000;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so USD muon tinh: ");
        int USD = input.nextInt();
        System.out.println("VND quy doi: " + USD*rate);
    }
}
