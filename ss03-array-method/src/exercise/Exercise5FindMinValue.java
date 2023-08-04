package exercise;

import java.util.Scanner;

public class Exercise5FindMinValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        // Do dai cua mang
        System.out.println("Length of Array : ");
        int lengthArray = input.nextInt();
        int[] integerArray = new int[lengthArray];

        // Nhap cac phan tu cho mang
        int i = 0;
        while (i < lengthArray) {
            System.out.print("Enter element " + (i + 1) + " of integerArray : ");
            integerArray[i] = scanner.nextInt();
            i++;
        }

        // in ra cac gia tri cua mang
        for (int valueArray:  integerArray) {
            System.out.print(valueArray+",");
        }

        // tim min
        int min = integerArray[0];
        for (int j = 1; j < integerArray.length; j++) {
            if (min>integerArray[j]){
                min = integerArray[j];
            }
        }
        // In ket qua Min
        System.out.println("The smallest number in array: "+min);
    }
}
