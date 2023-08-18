package exercise.IllustrationInsertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list: "+Arrays.toString(list));


        System.out.println("Begin sort processing...");
        insertionSortByStep(list);


    }

    public static void insertionSortByStep(int[] list) {
        int key;
        int j;
        for (int i = 1; i < list.length; ++i) {
            key = list[i];
            j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                System.out.println("Swap " + list[j+1] + " with " + key);
                j = j - 1;
            }
            list[j + 1] = key;
            if (list[j+1]!=key){
                System.out.println("Swap " + list[j+1] + " with " + key);
            }
        }

        System.out.println(Arrays.toString(list));
    }
}