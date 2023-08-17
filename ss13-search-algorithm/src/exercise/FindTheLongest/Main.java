package exercise.FindTheLongest;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();

        // 1 vòng lặp
        for (int j = 0; j < string.length(); j++) {
            // 1 câu lệnh
            if ((!list.isEmpty()) && (string.charAt(j) <= list.getLast())) {
                list.clear();
            }

            // 1 câu lệnh
            list.add(string.charAt(j));


            // 1 câu lệnh
            if (max.size() < list.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        String result = "";
        // 1 vòng lặp
        for (Character character : max) {
            // 1 câu lệnh
            result += character;
        }
        System.out.println(result);
    }
}
/*********************************************************************************
 * Tính toán độ phức tạp của bài toán này:                                        *
 * 	1 vòng lặp * 3 câu lệnh = 3;                                                  *
 * 	1 vòng lặp * 1 câu lệnh = 1;                                                  *
 *                                                                                *
 * 	T(n) = O(n)                                                                   *
 *  Độ phức tạp của bài toán là O(n)                                           	  *
 *********************************************************************************/