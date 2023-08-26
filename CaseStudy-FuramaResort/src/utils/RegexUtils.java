package utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtils {
    private String regex;
    public boolean validate(String regex,String REGEX) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean is18YearsOld(String birthday) {
        LocalDate birthDate = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        return period.getYears() >= 18;
    }

    public boolean validateIdFacility(String string){
        regex = "^(SV)[A-Z]{2}(-)[0-9]{4}$";
        if (!validate(string,regex)){
            System.out.println("ID Service không hợp lệ !");
        }
        return validate(string,regex);
    }
    public boolean validateIdEmployee(String string){
        regex = "^(NV-)+[0-9]{4}$";
        if (!validate(string,regex)){
            System.out.println("Mã nhân viên không hợp lệ !");
        }
        return validate(string,regex);
    }

    public boolean validateIdCustomer(String string){
        regex = "^(KH-)+[0-9]{4}$";
        if (!validate(string,regex)){
            System.out.println("Mã khach hang không hợp lệ !");
        }
        return validate(string,regex);
    }

    public boolean validateName(String string){
        regex = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
        if (!validate(string,regex)){
            System.out.println("Tên không hợp lệ !");
        }
        return validate(string,regex);
    }

    public boolean validateBirthday(String string){
        regex = "^(0[1-9]|[1-2][0-9]|3[0-1])-(0[1-9]|1[0-2])-((19|20)\\d{2})$";
        if (!validate(string,regex) || !is18YearsOld(string)){
            if (!validate(string,regex)){
                System.out.println("Birthday khong dung dinh dang");
            } else {
                System.out.println("Khong duoc phep nhap duoi 18 tuoi");
            }
            return false;
        } else {
            return true;
        }
    }

    public boolean validateGender(String string){
        regex = "^(Male|Female|male|female)$";
        if (!validate(string,regex)){
            System.out.println("Gioi tinh không hợp lệ !");
        }
        return validate(string,regex);
    }

    public boolean validateIdentityCard(String string){
        regex = "^[0-9]{9}|[0-9]{12}$";
        if (!validate(string,regex)){
            System.out.println("CMND không hợp lệ !");
        }
        return validate(string,regex);
    }

    public boolean validatePhoneVietNam(String string){
        regex = "^(84|0)[2|3|5|7|8|9]{1}[0-9]{8}$";
        if (!validate(string,regex)){
            System.out.println("So dien thoai không hợp lệ !");
        }
        return validate(string,regex);
    }

    public boolean validateEmail(String string){
        regex = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}";
        if (!validate(string,regex)){
            System.out.println("Email không hợp lệ !");
        }
        return validate(string,regex);
    }

    public boolean validateLevel(String string){
        regex = "^(Trung cấp|Cao đẳng|Đại học|Sau đại học)$";
        if (!validate(string,regex)){
            System.out.println("Trinh do không hợp lệ !");
        }
        return validate(string,regex);
    }

    public boolean validateType(String string){
        regex = "^(Diamond|Platinum|Gold|Silver|Member)$";
        if (!validate(string,regex)){
            System.out.println("Level không hợp lệ !");
        }
        return validate(string,regex);
    }

    public boolean validatePositions(String string){
        regex = "^(Lễ tân|Phục vụ|Chuyên viên|Giám sát|Quản lý|Giám đốc)$";
        if (!validate(string,regex)){
            System.out.println("Dia chi không hợp lệ !");
        }
        return validate(string,regex);
    }

    public boolean validateLocation(String string){
        regex = "^[A-Za-z0-9, ]+$";
        if (!validate(string,regex)){
            System.out.println("Dia chi không hợp lệ !");
        }
        return validate(string,regex);
    }
    public boolean validateAmount(String string){
        regex = "^[0-9]{1,}$";
        if (validate(string,regex) && Integer.parseInt(string) > 0){
            return true;
        } else {
            if (!validate(string,regex)){
                System.out.println("Dinh dang không hợp lệ !");
            } else {
                System.out.println("Thu nhap phai lon hon 0 !");
            }
            return false;
        }
    }

    public boolean validateArea(String string){
        regex = "^[3-9][0-9]|[1-9]{1}[0-9]{2,}$";
        if (!validate(string,regex)){
            System.out.println("Nhap vao khong hop le");
            return false;
        } else {
            if (Integer.parseInt(string)<=30){
                System.out.println("Phai nhap so lon hon 30 !");
                return false;
            } else {
                return true;
            }
        }
    }

    public boolean validatePrice(String string){
        regex = "^[0-9]\\d*(\\.\\d+)?$";
        if (!validate(string,regex)){
            System.out.println("Chuoi nhap vao khong hop le");
            return false;
        } else {
            if (Float.parseFloat(string)<=0){
                System.out.println("So nhap vao phai lon hon 0");
                return false;
            } else {
                return true;
            }
        }
    }

    public boolean validateMaxPeople(String string){
        regex = "^([1-9]{1}|[1][0-9])$";
        if (!validate(string,regex)){
            System.out.println("Nhap vao khong hop le ! (Min 1 - Max 20)");
            return false;
        } else {
            return true;
        }
    }

    public boolean validateTypeRental(String string){
        regex = "^([1-4]{1})";
        if (!validate(string,regex)){
            System.out.println("Lua chon khong hop le");
            return false;
        } else {
            return true;
        }
    }

    public boolean validateNumberFloors(String string){
        regex = "^([1-9]{1}|[1][0-9])$";
        if (!validate(string,regex)){
            System.out.println("Nhap vao khong hop le ! (Min 1 - Max 20)");
            return false;
        } else {
            return true;
        }
    }

    public boolean validateOnlyText(String string){
        regex = "^[a-zA-Z\\s\\,]+$";
        if (!validate(string,regex)){
            System.out.println("Chi duoc phep nhap chu");
            return false;
        } else {
            return true;
        }
    }
}
