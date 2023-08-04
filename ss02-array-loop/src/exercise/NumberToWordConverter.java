package exercise;

import java.util.Scanner;

public class NumberToWordConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số từ 0 đến 999: ");
        int number = scanner.nextInt();

        if (number > 999) {
            System.out.println("Ngoài khả năng");
        } else {
            String result = convertNumberToWord(number);
            System.out.println("Phiên âm: " + result);
        }

        scanner.close();
    }

    public static String convertNumberToWord(int number) {
        String[] units = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười",
                "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu",
                "mười bảy", "mười tám", "mười chín"};
        String[] tens = {"", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi",
                "bảy mươi", "tám mươi", "chín mươi"};

        if (number == 0) {
            return "không";
        }

        String word = "";
        if ((number / 100) > 0) {
            word += units[number / 100] + " trăm ";
            number %= 100;
        }

        if (number > 0) {
            if (number <= 19) {
                word += units[number];
            } else {
                word += tens[number / 10];
                if ((number % 10) > 0) {
                    word += " " + units[number % 10];
                }
            }
        }

        return word;
    }
}
