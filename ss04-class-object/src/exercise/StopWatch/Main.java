package exercise.StopWatch;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        // lay time bat dau;
        LocalTime timeStart = LocalTime.now();

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
        LocalTime timeEnd = LocalTime.now();
        System.out.println("");

        // Tao doi tuong bat dau va ket thuc;
        StopWatch time = new StopWatch(timeStart, timeEnd);

        // In ra thoi diem chay
        System.out.println(time.getStartTime());

        // In ra thoi diem ket thuc
        System.out.println(time.getEndTime());

        // Dung phuong thuc getElapsedTime va in ra
        System.out.println(time.getElapsedTime()+" ms");
    }
}
