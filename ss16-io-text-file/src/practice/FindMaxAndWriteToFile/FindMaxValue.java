package practice.FindMaxAndWriteToFile;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\CodeGym\\C0623G1_Pham_Van_Thanh_Module2\\ss16-io-text-file\\src\\practice\\FindMaxAndWriteToFile\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\CodeGym\\C0623G1_Pham_Van_Thanh_Module2\\ss16-io-text-file\\src\\practice\\FindMaxAndWriteToFile\\result.txt", maxValue);
    }
}
