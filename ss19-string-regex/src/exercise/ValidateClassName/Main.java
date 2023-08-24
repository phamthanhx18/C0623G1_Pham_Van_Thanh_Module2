package exercise.ValidateClassName;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final String REGAX_CLASS_NAME = "^[C|A|P]+[0-9]{4}+[G|H|I|K]$";
        Scanner scanner = new Scanner(System.in);
        String className;
        do {
            System.out.println("Nhap ten class: ");
            className = scanner. nextLine();
            if (validate(className,REGAX_CLASS_NAME)){
                System.out.println("Ten class hop le");
            } else {
                System.out.println("Ten class khong dung dinh dang yeu cau, vui long thu lai !");
            }
        } while (!validate(className,REGAX_CLASS_NAME));
    }
    public static boolean validate(String regex,String REGEX) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
