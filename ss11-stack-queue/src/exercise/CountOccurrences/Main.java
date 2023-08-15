package exercise.CountOccurrences;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String string = "hoc java co ban den nang cao hoc co ban den nang cao";
        String [] arrayString = string.split(" ");
        System.out.println(Arrays.toString(arrayString));

        TreeMap<String, Integer> map = new TreeMap<>();
        for (String value: arrayString) {
            if (!map.containsKey(value)) {
                map.put(value,1);
            } else {
                Integer count = map.get(value);
                count++;
                map.replace(value,count);
            }
        }
        System.out.println(map);
    }
}
