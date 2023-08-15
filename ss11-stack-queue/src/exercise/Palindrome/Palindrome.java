package exercise.Palindrome;

import java.util.Arrays;
import java.util.Stack;

public class Palindrome {
    public String[] stringToArray(String string){
        String[] arrayString = string.split("");
        return arrayString;
    }

    public Stack[] pushStack(String string){
        String[] arrayString = this.stringToArray(string);
        Stack stack = new Stack<>();
        for (int i = 0; i < arrayString.length; i++) {
            stack.push(arrayString[i].toLowerCase());
        }

        Stack reverseStack = new Stack<>();
        for (int i = arrayString.length -1 ; i >=0; i--) {
            reverseStack.push(arrayString[i].toLowerCase());
        }

        Stack[] stacks = {stack,reverseStack};
        return stacks;
    }

    public void checkPalindrome(String string) {
        Stack[] arrayStack = this.pushStack(string);
        if (arrayStack[0].equals(arrayStack[1])) {
            System.out.println("Đây là chuỗi Panlindrome !");
        } else {
            System.out.println("Đây không phải chuỗi Panlindrome !");
        }
    }
}
