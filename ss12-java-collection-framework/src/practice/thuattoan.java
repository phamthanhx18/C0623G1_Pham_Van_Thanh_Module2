package practice;

import java.util.Arrays;

public class thuattoan {

    String solution(String s) {
        String[] strArray = s.split("");
        char[] charArray = s.toCharArray();
        String result = "";
        System.out.println(Arrays.toString(strArray));
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                if (i - 1 > 0) {
                    result += " " + charArray[i];
                } else {
                    result += charArray[i];
                }
            } else {
                result += charArray[i];
            }
        }
        result = result.toLowerCase();
        return result;
    }
}
