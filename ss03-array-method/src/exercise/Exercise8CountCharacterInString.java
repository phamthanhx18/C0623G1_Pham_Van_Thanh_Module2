package exercise;

import java.util.Scanner;

public class Exercise8CountCharacterInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Do dai cua mang
        System.out.println("Input String : ");
        String string = input.nextLine();

        System.out.println("Input Char : ");
        String character = input.nextLine();

        // chuyen string thanh array
        String [] stringArray = string.split("");

        // Tao 1 bien string de luu vi tri xuat hien
        String index = "";
        int count = 0;

        //kiem tra xem co trong mang khong;
        for (int i = 0; i < stringArray.length; i++) {
            if (character.equals(stringArray[i])) {
                index += i + ",";
                count++;
            }
        }
        System.out.println(character +" display "+ count + " times in position " +index);
    }
}
