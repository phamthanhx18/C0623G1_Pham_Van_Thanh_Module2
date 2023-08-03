package exercise;

import java.util.Scanner;

public class Exercise3ReadNumbersInToWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap can nang cua ban: ");
        String weight = input.nextLine();
        int numberWeight = Integer.parseInt(weight);

        int lengthWeight = weight.length();
        String[] number = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] words = weight.split("");

        for (int i = 0; i < lengthWeight; i++) {
            if (lengthWeight == 1) {
                int count = Integer.parseInt(words[i]);
                System.out.println(number[count - 1]);
            } else if (lengthWeight == 2) {
                if (i == 0) {
                    if (numberWeight > 20) {
                        int count = Integer.parseInt(words[i]);
                        if (count == 2) {
                            System.out.print("Twenty ");
                        } else {
                            System.out.print(number[count - 1] + "ty ");
                        }
                    }
                } else {
                    if (numberWeight > 20) {
                        int count = Integer.parseInt(words[i]);
                        if (count > 0) {
                            System.out.print(number[count - 1]);
                        }
                    } else {
                        int count = Integer.parseInt(words[i]);
                        switch (numberWeight) {
                            case 10:
                                System.out.print("Ten");
                                break;
                            case 11:
                                System.out.print("Eleven");
                                break;
                            case 12:
                                System.out.print("Twelve");
                                break;
                            case 13:
                                System.out.print("Thirteen");
                                break;
                            case 15:
                                System.out.print("Fifteen");
                                break;
                            case 18:
                                System.out.print("Eighteen");
                                break;
                            case 20:
                                System.out.print("Twenty");
                                break;
                            default:
                                System.out.print(number[count - 1] + "teen");
                        }
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
                    if (count > 2) {
                        System.out.print(" and " + number[count - 1] + "ty ");
                    } else if (count==2){
                        System.out.print(" twenty ");
                    } else if (count==1) {
                        count = Integer.parseInt(words[i+1]);
                        switch (count) {
                            case 1:
                                System.out.print(" Eleven");
                                break;
                            case 2:
                                System.out.print(" Twelve");
                                break;
                            case 3:
                                System.out.print(" Thirteen");
                                break;
                            case 4:
                                System.out.print(" Fourteen");
                                break;
                            case 5:
                                System.out.print(" Fifteen");
                                break;
                            case 6:
                                System.out.print(" Sixteen");
                                break;
                            case 7:
                                System.out.print(" Seventeen");
                                break;
                            case 8:
                                System.out.print(" Eighteen");
                                break;
                            case 9:
                                System.out.print(" Nineteen");
                                break;
                            case 0:
                                System.out.print(" Ten");
                                break;
                        };
                    }
                }
                if (i == 2) {
                    int count = Integer.parseInt(words[i-1]);
                    int countTwo = Integer.parseInt(words[i]);
                    if (count > 1) {
                        System.out.println(number[countTwo - 1]);
                    }
                }
            }
        }
    }
}
