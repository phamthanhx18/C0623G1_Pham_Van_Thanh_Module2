package exercise;

public class Exercise2Show20Prime {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        int count = 0;
        int N = 2;
        // N la bien duoc dat theo de bai
        do {
            int countCheckPrime = 0;
            for (int j = 2; j < (N - 1); j++) {
                if (N % j == 0) {
                    countCheckPrime++;
                }
            }
            if (countCheckPrime == 0) {
                numbers[count] = N;
                count++;
            }
            N++;
        }
        while (count < numbers.length);
        for (int number : numbers) {
            System.out.print(number + ",");
        }
    }
}