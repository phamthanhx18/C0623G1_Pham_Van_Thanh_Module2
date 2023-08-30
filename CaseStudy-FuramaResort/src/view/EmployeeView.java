package view;

import controller.EmployeeController;
import model.Person.Employee;
import utils.RegexUtils;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private final Scanner scanner = new Scanner(System.in);
    private final RegexUtils regexUtils = new RegexUtils();
    private final EmployeeController employeeController = new EmployeeController();

    public void runMenuEmployeeManagement() {
        int choiceEmployee;
        do {
            System.out.println("---MenuEmployeeManagement---");
            displayEmployeeManagement();
            choiceEmployee = Integer.parseInt(scanner.nextLine());
            switch (choiceEmployee) {
                case 1:
                    displayListEmployee(employeeController.getList());
                    MainView.displayMessegeSucces();
                    break;
                case 2:
                    employeeController.add(inputEmployee());
                    MainView.displayMessegeSucces();
                    break;
                case 3:
                    employeeController.editEmployee(inputIdEmployee(),inputEmployee());
                    MainView.displayMessegeSucces();
                    break;
                case 4:
                    employeeController.del(inputIdEmployee());
                    MainView.displayMessegeSucces();
                    break;
                case 5:
                    displayListEmployee(employeeController.searchEmployee(inputNameEmployee()));
                    break;
                case 6:
                    break;
                default:
                    MainView.displayErrorChoice();
            }
        } while (choiceEmployee != 6);
    }


    public void displayEmployeeManagement() {
        System.out.println("1 Display list employees\n" +
                "2 Add new employee\n" +
                "3 Edit employee\n" +
                "4 Delete employee\n" +
                "5 Search by name employee\n" +
                "6 Return main menu");
    }

    public Employee inputEmployee() {
        String id;
        do {
            System.out.println("Nhap ID Employee (Ex: NV-YYYY)");
            id = scanner.nextLine();
        } while (!regexUtils.validateIdEmployee(id));

        String fullName;
        do {
            System.out.println("Nhap fullName Employee (Ex: Pham Van Thanh)");
            fullName = scanner.nextLine();
        } while (!regexUtils.validateName(fullName));

        String birthday;
        do {
            System.out.println("Nhap birthday Employee (EX: 18-12-2000)");
            birthday = scanner.nextLine();
        } while (!regexUtils.validateBirthday(birthday));

        String gender;
        do {
            System.out.println("Nhap gender Employee");
            gender = scanner.nextLine();
        } while (!regexUtils.validateGender(gender));

        String identityCard;
        do {
            System.out.println("Nhap identityCard Employee");
            identityCard = scanner.nextLine();
        } while (!regexUtils.validateIdentityCard(identityCard));

        String phone;
        do {
            System.out.println("Nhap phone Employee");
            phone = scanner.nextLine();
        } while (!regexUtils.validatePhoneVietNam(phone));

        String email;
        do {
            System.out.println("Nhap email Employee");
            email = scanner.nextLine();
        } while (!regexUtils.validateEmail(email));

        String level;
        do {
            System.out.println("Nhap trinh do Employee (Trung cấp|Cao đẳng|Đại học|Sau đại học)");
            level = scanner.nextLine();
        } while (!regexUtils.validateLevel(level));

        String positions;
        do {
            System.out.println("Nhap location Employee");
            positions = scanner.nextLine();
        } while (!regexUtils.validatePositions(positions));

        String amount;
        do {
            System.out.println("Nhap amount Employee: (Ex: 100000000)");
            amount = scanner.nextLine();
        } while (!regexUtils.validateAmount(amount));
        return new Employee(id,fullName,birthday,gender,identityCard,phone,email,level,positions,amount);
    }

    public String inputIdEmployee(){
        String string;
        do {
            System.out.println("Nhap ID");
            string = scanner.nextLine();
        } while (!regexUtils.validateIdEmployee(string));
        return string;
    }

    public String inputNameEmployee(){
        String string;
        do {
            System.out.println("Nhap Ten");
            string = scanner.nextLine();
        } while (!regexUtils.validateOnlyText(string));
        return string;
    }

    public void displayListEmployee(List<Employee> employees){
        if (employees.isEmpty()){
            System.out.println("Không có dữ liệu");
        }else {
            for (Employee employee: employees) {
                System.out.println(employee);
            }
        }
    }
}