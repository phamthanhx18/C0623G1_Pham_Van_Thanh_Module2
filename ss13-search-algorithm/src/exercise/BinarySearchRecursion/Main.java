package exercise.BinarySearchRecursion;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập độ dài của mảng");
        int lengthArray = scanner.nextInt();

        int[] arrayNumbers = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            System.out.println("Nhập phần tử "+(i+1)+" cho mảng");
            arrayNumbers[i] =  scanner.nextInt();
        }
        Arrays.sort(arrayNumbers);
        System.out.println("Mảng sau khi được sắp xếp: "+Arrays.toString(arrayNumbers));

        Main main = new Main();
        System.out.println("Nhập phần tử cần tìm trong mảng");
        int value = scanner.nextInt();

        int index = main.binarySearch(arrayNumbers,0,arrayNumbers.length - 1,value);
        if (index>=0) {
            System.out.println(value+" ở vị trí "+index+" trong mảng");
        } else {
            System.out.println(value+" không tồn tại trong mảng");
        }

    }

    public int binarySearch(int[] array, int left, int right ,int value) {
        if (left<=right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            }
            if (array[middle]<value){
                left = middle + 1;
                return binarySearch(array,left,right,value);
            } else {
                right = middle - 1;
                return binarySearch(array,left,right,value);
            }
        }
        return -1;
    }
}
