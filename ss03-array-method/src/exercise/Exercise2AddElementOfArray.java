package exercise;

import java.util.Scanner;

public class Exercise2AddElementOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Length of Array: ");
        int lengthArray = input.nextInt();
        int[] integerArray = new int[lengthArray];

        int i = 0;
        while (i < integerArray.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            integerArray[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Number add to Array: ");
        int numberAdd = input.nextInt();
        int indexAdd;
        do {
            System.out.println("Index add to Array: ");
            indexAdd = input.nextInt();
            if (indexAdd < 0) {
                System.out.println("Element cannot be less than 0,'Please try again' ");
            } else if (indexAdd > lengthArray) {
                System.out.println("Element cannot be greater than the number of elements in the array,'Please try again' ");
            }
        } while (indexAdd < 0 || indexAdd > lengthArray);

        int[] integerArrayNew = new int[lengthArray + 1];
        int count = 0;
        for (int j = 0; j < integerArray.length; j++) {
            if (j == indexAdd) {
                integerArrayNew[count] = numberAdd;
                count++;
            }
            integerArrayNew[count] = integerArray[j];
            count++;
        }

        System.out.print("Array New: ");
        for (int intValue : integerArrayNew) {
            System.out.print(intValue + ",");
        }

    }
}
