package exercise.BinarySystem;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack stack = new Stack<>();
        System.out.println("Nhập số thập phân cần chuyển sang nhị phân");
        int binary =  scanner.nextInt();
        int quotient;
        do {
            quotient = binary%2;
            stack.push(quotient);
            binary = binary/2;
        } while (binary>=1);

        int size = stack.size();
        String result = "";
        for (int i = 0; i < size; i++) {
            result+= stack.pop();
        }
        System.out.println("Kết quả khi chuyển sang nhị phân là: "+result);
    }
}
