package exercise.Reverse;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> wStack = new Stack<>();
        wStack.push(1);
        wStack.push(2);
        wStack.push(3);
        wStack.push(4);

        System.out.println("Gia tri mang cu");
        System.out.println(Arrays.toString(wStack.toArray()));


        int size = wStack.size();
        Stack<Integer> listPopStack = new Stack<>();
        for (int i = 0; i <size; i++) {
            listPopStack.push(wStack.pop());
        }

        wStack = listPopStack;

        System.out.println("Gia tri mang sau khi dao");
        System.out.println(Arrays.toString(wStack.toArray()));
    }
}
