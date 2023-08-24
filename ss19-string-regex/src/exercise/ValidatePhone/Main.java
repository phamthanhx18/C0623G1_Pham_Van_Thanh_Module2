package exercise.ValidatePhone;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final String REGAX_PHONE = "^[(]84[)]+[-(0]+[0-9]{9}+[)]$";
        Scanner scanner = new Scanner(System.in);
        String numberPhone;
        do {
            System.out.println("Nhap so dien thoai: ");
            numberPhone = scanner.nextLine();
            if (validate(numberPhone,REGAX_PHONE)){
                System.out.println(numberPhone+" la so dien thoai VN hop le");
            } else {
                System.out.println(numberPhone+" la so dien thoai khong dung dinh dang yeu cau, vui long thu lai !");
            }
        } while (!validate(numberPhone,REGAX_PHONE));
    }
    public static boolean validate(String regex,String REGEX) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
