package exercise.InsertionSort;

public class Main {
    public static void main(String[] args) {
        int [] list = {1,8,4,33,2,6,44,1332,5,99};
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; ++i) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }
}
