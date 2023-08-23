package exercise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        int [] b = {178, 120, -1, 190, 155, -1, -1, -1, 162};
        System.out.println(Arrays.toString(Main.solution(a)));
        System.out.println(Arrays.toString(Main.solution(b)));
    }
    public static int[] solution(int[] a) {
        for(int i = 0; i < a.length - 1; i++){
            for(int j = i + 1; j < a.length; j++){
                if (a[j]== -1){
                    continue;
                }
                if(a[j] < a[i]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        return a;
    }
}
