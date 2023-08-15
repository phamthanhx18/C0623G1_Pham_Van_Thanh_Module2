package exercise.CheckTheKeyTag;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap bieu thuc can check");
        String string = scanner.nextLine();
        CheckTheKeyTag checkTheKeyTag = new CheckTheKeyTag();
        checkTheKeyTag.result(string);
    }
}
