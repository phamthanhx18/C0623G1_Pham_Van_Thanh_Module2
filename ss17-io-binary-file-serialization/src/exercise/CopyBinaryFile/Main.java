package exercise.CopyBinaryFile;

import java.io.*;
import java.util.Scanner;

public class Main {
    public void readFileBinary(File pathfile, File pathFileCopy) {
        FileInputStream fileInputStream = null;
        FileOutputStream writeOutputStream = null;
        try {
            fileInputStream = new FileInputStream(pathfile);
            writeOutputStream = new FileOutputStream(pathFileCopy);

            int byt;
            while ((byt = fileInputStream.read()) != -1) {
                writeOutputStream.write(byt);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (writeOutputStream !=null) {
                    writeOutputStream.close();
                }
                if (fileInputStream !=null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        String nameFile;
        String nameFileToBeforeCopy;
        String fileCopy;
        String fileToBeforeCopy;
        File fileCopyData;
        File fileBeforeCopyData;
        String pathCopy = "D:\\CodeGym\\C0623G1_Pham_Van_Thanh_Module2\\ss17-io-binary-file-serialization\\src\\exercise\\CopyBinaryFile\\data\\";
        do {
            System.out.println("Nhap ten file can copy");
            nameFile = scanner.nextLine();
            fileCopy = pathCopy + nameFile;
            fileCopyData = new File(fileCopy);
            if (!fileCopyData.exists()) {
                System.out.println("File nay chua ton tai, vui long nhap chinh xac file can copy !");
            }
        } while (!fileCopyData.exists());

        do {
            System.out.println("Nhap ten file can tao moi");
            nameFileToBeforeCopy = scanner.nextLine();
            fileToBeforeCopy = pathCopy + nameFileToBeforeCopy;
            fileBeforeCopyData = new File(fileToBeforeCopy);
            if (fileBeforeCopyData.exists()) {
                System.out.println("File nay da ton tai, vui long nhap ten file chua co trong data !");
            }
        } while (fileBeforeCopyData.exists());
        main.readFileBinary(fileCopyData, fileBeforeCopyData);
    }
}
