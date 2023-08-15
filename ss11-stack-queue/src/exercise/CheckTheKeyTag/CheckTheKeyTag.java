package exercise.CheckTheKeyTag;

import java.util.Stack;

public class CheckTheKeyTag {
    public String[] stringToArray(String string){
        String[] arrayString = string.split("");
        return arrayString;
    }

    public boolean checkTheKeyTag(String string) {
        String[] arrayString = stringToArray(string);
        Stack bStack = new Stack<>();
        Stack sym = new Stack<>();
        Stack left = new Stack<>();
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].equals("(")) {
                bStack.push(arrayString[i]);
                sym.push(arrayString[i]);
            } else if (arrayString[i].equals(")")) {
                if (bStack.empty()) {
                    return false;
                } else {
                    left.push(bStack.pop());
                }
            }
        }
        if (sym.equals(left)) {
            return true;
        } else {
            return false;
        }
    }

    public void result(String string){
        boolean result = checkTheKeyTag(string);
        if (result) {
            System.out.println("Biểu thức sử dụng dấu ngoặc (Bracket) đúng");
        } else {
            System.out.println("Biểu thức sử dụng dấu ngoặc (Bracket) sai");
        }
    }
}
