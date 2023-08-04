package exercise;

import java.util.Scanner;

public class Exercise6SumNumbersSpecifiedColumn {
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

        //Check xem mang nao co length be nhat neu cac mang nhap vao co gia tri length khong bang nhau
        int minLength = integerArray[0].length;
        for (int j = 1; j < integerArray.length; j++) {
            if (minLength>integerArray[j].length) {
                minLength = integerArray[j].length;
            }
        }


        // Chon cot muon tinh tong

        int sumColumn;
        int totalColums = 0;
        String valueUseToSum = "";
        String valueOfIntegerArray = "";
        do {
            System.out.println("Input Colums Sum : ");
            sumColumn = input.nextInt();
            for (int j = 0; j < integerArray.length; j++) {
                for (int k = 0; k < integerArray[j].length; k++) {
                    valueOfIntegerArray += integerArray[j][k]+",";
                    // sumColums - 1 boi vi index tinh tu 0 - length -1
                    if (k==sumColumn-1) {
                        totalColums += integerArray[j][k];
                        valueUseToSum += integerArray[j][k]+",";
                    }
                }
            }
        // chi cho nhap cac cot la so be <= length cua mang co length be nhat
        } while (sumColumn>minLength);
        System.out.println("Mang duoc khoi tao la: " + valueOfIntegerArray);
        System.out.println("Cot muon tinh tong la: " + sumColumn);
        System.out.println("Tong cac gia tri cua cot "+sumColumn+" ("+valueUseToSum+"): " + totalColums);
    }
}
