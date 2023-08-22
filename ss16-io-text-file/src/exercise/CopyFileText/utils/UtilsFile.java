package exercise.CopyFileText.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UtilsFile {
    private static final String pathFolderData = "D:\\CodeGym\\C0623G1_Pham_Van_Thanh_Module2\\ss16-io-text-file\\src\\exercise\\CopyFileText\\data\\";
    private static final Scanner scanner = new Scanner(System.in);
    public static List<String> readFile() {
        ArrayList<String> strings = new ArrayList<>();
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader;
        String pathName;
        boolean success = false;
        while (!success) {
            try {
                System.out.println("Nhap ten file muon chep du lieu");
                pathName = scanner.nextLine();
                file = new File(pathFolderData + pathName);
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String string;
                while ((string = bufferedReader.readLine()) != null) {
                    strings.add(string);
                }
                bufferedReader.close();
                fileReader.close();
                success = true;
            } catch (FileNotFoundException e) {
                System.out.println("File khong ton tai, vui long thu lai !");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return strings;
    }

    public static void displayNumberStringInFile(List<String> strings){
        int count = 0;
        for(String s: strings) {
            count+=s.length();
        }
    System.out.println("Co tat ca "+count +" ki tu !");
    }

    public static void copyFile() {
        List<String> strings = readFile();
        displayNumberStringInFile(strings);
        File file;
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        boolean success = false;
        while (!success) {
            try {
                System.out.println("Nhap ten file đích can luu");
                String nameFileToCopy = scanner.nextLine();
                file = new File(pathFolderData+nameFileToCopy);
                if( !file.exists()) {
                    fileWriter = new FileWriter(file);
                    bufferedWriter = new BufferedWriter(fileWriter);

                    for (String string: strings) {
                        bufferedWriter.write(string);
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.close();
                    fileWriter.close();
                    success = true;
                } else {
                    System.out.println("File nay da ton tai, vui long thu lai");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
