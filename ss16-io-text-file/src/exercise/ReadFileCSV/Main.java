package exercise.ReadFileCSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String pathFolderData = "D:\\CodeGym\\C0623G1_Pham_Van_Thanh_Module2\\ss16-io-text-file\\src\\exercise\\ReadFileCSV\\data\\";
        String line;
        String splitBy = ",";
        try {
            File file = new File(pathFolderData+"data.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            while ((line = br.readLine()) != null) {
                String[] location = line.split(splitBy);
                System.out.println("Location [ID = " + location[0] + ", Code = " + location[1] + ", Name= " + location[2]+"]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
