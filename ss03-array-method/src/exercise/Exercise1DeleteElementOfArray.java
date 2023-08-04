package exercise;

import java.util.Scanner;

public class Exercise1DeleteElementOfArray {
    public static void main(String[] args) {
        int[] integerArray = {1, 3, 5, 3, 9, 11, 13, 11, 30, 35};
        int[] integerArrayNew = new int[integerArray.length];
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so can xoa: ");
        int numberX = input.nextInt();
        int count = 0;
        for (int i = 0; i < integerArray.length; i++) {
            if (numberX == integerArray[i]) {
                continue;
            }
            integerArrayNew[count] = integerArray[i];
            count++;
        }
        for (int intValue : integerArrayNew) {
            System.out.print(intValue + ",");
        }
    }
}
