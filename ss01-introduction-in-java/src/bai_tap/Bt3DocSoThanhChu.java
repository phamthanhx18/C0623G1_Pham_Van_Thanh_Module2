package bai_tap;

import java.util.Scanner;

public class Bt3DocSoThanhChu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap can nang cua ban: ");
        String KG = input.nextLine();
        int toNumber = Integer.parseInt(KG);

        int lengthKg = KG.length();
        String[] number = {"one", "two", "three", "for", "five", "six", "seven", "each", "night"};
        String[] words = KG.split("");

        for (int i = 0; i < lengthKg; i++) {
            if (lengthKg == 1) {
                int count = Integer.parseInt(words[i]);
                System.out.println(number[count - 1]);
            } else if (lengthKg == 2) {
                if (i == 0) {
                    if (toNumber > 20) {
                        int count = Integer.parseInt(words[i]);
                        System.out.println(count);
                        System.out.print(number[count] + "ty ");
                    }
                } else {
                    if (toNumber >= 20) {
                        int count = Integer.parseInt(words[i]);
                        if (count > 0) {
                            System.out.print(number[count - 1]);
                        }
                    } else {
                        int count = Integer.parseInt(words[i]);
                        System.out.print(number[count - 1] + " teen");
                    }
                }
            } else {
                if (i == 0) {
                    int count = Integer.parseInt(words[i]);
                    System.out.println(count);
                    System.out.print(number[count - 1] + " hundred");
                }
                if (i == 1) {
                    int count = Integer.parseInt(words[i]);
                    if (count > 0) {
                        System.out.print(" and " + number[count - 1] + "ty ");
                    }
                }
                if (i == 2) {
                    int count = Integer.parseInt(words[i]);
                    System.out.println(number[count - 1]);
                }
            }
        }
    }
}
