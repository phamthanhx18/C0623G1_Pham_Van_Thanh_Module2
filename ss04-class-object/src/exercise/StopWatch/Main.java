package exercise.StopWatch;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        time.start();

        // Tao mang random 100.000 number
        int[] arrayThousandNumber = new int[100000];
        for (int i = 0; i < 100000; i++) {
            // Gan gia tri random <1000 cho cac phan tu
            arrayThousandNumber[i] = (int) (Math.random() * 1000);
        }

        // Sap xep mang theo thu tu tang dan;
        int valueDefault;
        for (int i = 0; i < arrayThousandNumber.length - 1; i++) {
            for (int j = i + 1; j < arrayThousandNumber.length; j++) {
                if (arrayThousandNumber[i] > arrayThousandNumber[j]) {
                    // Hoan vi 2 so [i] va [j]
                    valueDefault = arrayThousandNumber[i];
                    arrayThousandNumber[i] = arrayThousandNumber[j];
                    arrayThousandNumber[j] = valueDefault;
                }
            }
        }

        time.stop();

        System.out.println(" ");

        int totalTime = time.getElapsedTime();

        // Dung phuong thuc getElapsedTime va in ra
        System.out.println(totalTime+" ms");
    }
}
