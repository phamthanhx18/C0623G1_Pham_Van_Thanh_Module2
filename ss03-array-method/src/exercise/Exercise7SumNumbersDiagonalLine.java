package exercise;

import java.util.Scanner;

public class Exercise7SumNumbersDiagonalLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        // Do dai cua mang
        System.out.println("Length of Array : ");
        int lengthArray = input.nextInt();
        int[][] integerArray = new int[lengthArray][];

        // Do dai cho cac mang con
        int i = 0;
        while (i < lengthArray) {
            System.out.print("Enter length sub Array " + (i + 1) + " of Array : ");
            integerArray[i] = new int[scanner.nextInt()];
            i++;
        }

        // input gia tri cho tung phan tu o mang con
        for (int j = 0; j < integerArray.length; j++) {
            for (int k = 0; k < integerArray[j].length; k++) {
                System.out.print("Input number " + (k + 1) + " of sub array" + (j + 1) + " : ");
                integerArray[j][k] = scanner.nextInt();
            }
        }


        // Tinh tong
        int sum = 0;
        String numbersInDiagonal = "";
        for (int j = 0; j < integerArray.length ; j++) {
            numbersInDiagonal += integerArray[j][j]+"+";
            sum+= integerArray[j][j];
        }
        System.out.println("("+numbersInDiagonal+")"+sum);
    }
}
