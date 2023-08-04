package exercise;

import java.util.Scanner;

public class Exercise3MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Length of Array 1: ");
        int lengthArray1 = input.nextInt();

        System.out.println("Length of Array 2: ");
        int lengthArray2 = input.nextInt();

        // Nhap do dai cho 2 mang
        int[] integerArray1 = new int[lengthArray1];
        int[] integerArray2 = new int[lengthArray2];

        // Nhap cac phan tu trong mang 1
        int i = 0;
        while (i < integerArray1.length) {
            System.out.print("Enter element " + (i + 1) + " of integerArray1 : ");
            integerArray1[i] = scanner.nextInt();
            i++;
        }

        // Nhap cac phan tu trong mang 2
        int j = 0;
        while (j < integerArray2.length) {
            System.out.print("Enter element " + (j + 1) + " of integerArray2 : ");
            integerArray2[j] = scanner.nextInt();
            j++;
        }

        // Tao mang moi de luu gia tri khi gop
        int[] integerArrayNew = new int[lengthArray1 + lengthArray2];
        int count = 0;
        for (int k = 0; k < lengthArray1; k++) {
            integerArrayNew[count] = integerArray1[k];
            count++;
        }
        for (int e = 0; e < lengthArray2; e++) {
            integerArrayNew[count] = integerArray2[e];
            count++;
        }

        System.out.print("Array after Merge: ");
        for (int valueArray:integerArrayNew) {
            System.out.print(valueArray+",");
        }
    }
}
