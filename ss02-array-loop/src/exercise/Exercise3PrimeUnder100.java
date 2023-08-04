package exercise;

public class Exercise3PrimeUnder100 {
    public static void main(String[] args) {
        String primeUnder100 = "";
        int count;
        for (int i = 2; i < 100; i++) {
            count = 0;
            for (int j = 2; j < (i - 1); j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                primeUnder100 += i + ",";
            }
        }
        System.out.print(primeUnder100);
    }
}