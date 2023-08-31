package view;

import controller.FalicityController;
import model.Facility.Facility;
import model.Facility.House;
import model.Facility.Room;
import model.Facility.Villa;
import utils.RegexUtils;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityView {
    private final Scanner scanner = new Scanner(System.in);
    private final RegexUtils regexUtils = new RegexUtils();
    private final FalicityController falicityController = new FalicityController();
    public void runMenuFacilityManagement() {
        int choiceFacility;
        do {
            System.out.println("---MenuFacilityManagement---");
            displayFacilityManagement();
            choiceFacility = Integer.parseInt(scanner.nextLine());
            switch (choiceFacility) {
                case 1:
                    displayListFacitily(falicityController.getList());
                    break;
                case 2:
                    falicityController.add(inputFacility());
                    break;
                case 3:
                    displayList(falicityController.displayFacilityMaintenance());
                    break;
                case 4:
                    falicityController.del(inputIdFacility());
                    break;
                case 5:
                    break;
                default:
                    MainView.displayErrorChoice();
            }
        } while (choiceFacility != 5);
    }

    public void displayFacilityManagement() {
        System.out.println("1 Display list facility\n" +
                "2 Add new facility\n" +
                "3 Display list facility maintenance\n" +
                "4 Delete facility\n" +
                "5 Return main menu");
    }

    public Facility inputFacility(){
        Facility facility = null;
        int choice;
        do {
            System.out.println("Chọn: \n" +
                    "1. Villa \n" +
                    "2. Room \n" +
                    "3. House");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice<=0 || choice>3) {
                System.out.println("Lua chon khong hop le !");
            }
        } while (choice<=0 || choice>3);

        String nameService;
        do {
            System.out.println("Nhap ten! (Ex: Room VIP");
            nameService = scanner.nextLine();
        } while (!regexUtils.validateName(nameService));

        int areaRoom;
        do {
            System.out.println("Nhap dien tich phong!");
            areaRoom = Integer.parseInt(scanner.nextLine());
        } while (!regexUtils.validateArea(String.valueOf(areaRoom)));

        float priceRental;
        do {
            System.out.println("Nhap gia phong!");
            priceRental = Float.parseFloat(scanner.nextLine());
        } while (!regexUtils.validatePrice(String.valueOf(priceRental)));

        int maxPeople;
        do {
            System.out.println("Nhap so nguoi o toi da");
            maxPeople = Integer.parseInt(scanner.nextLine());
        } while (!regexUtils.validateMaxPeople(String.valueOf(maxPeople)));

        int rentalType;
        do {
            System.out.println("Kieu thue: (1. Theo nam, 2. Theo thang, 3. Theo ngay!, 4. Theo gio)");
            rentalType = Integer.parseInt(scanner.nextLine());
        } while (!regexUtils.validateTypeRental(String.valueOf(rentalType)));


        String standard;
        int areaPool;

        switch (choice) {
            case 1:
                do {
                    System.out.println("Nhap tieu chuan phong!");
                    standard = scanner.nextLine();
                } while (!regexUtils.validateName(standard));

                do {
                    System.out.println("dien tich ho boi!");
                    areaPool = Integer.parseInt(scanner.nextLine());
                } while (!regexUtils.validateArea(String.valueOf(areaPool)));

                int numberFloors;
                do {
                    System.out.println("So tang!");
                    numberFloors = Integer.parseInt(scanner.nextLine());
                } while (!regexUtils.validateNumberFloors(String.valueOf(numberFloors)));

                facility = new Villa(nameService,areaRoom,priceRental,maxPeople,rentalType,standard,areaPool,numberFloors);
                break;
            case 2:
                String freeService;
                do {
                    System.out.println("Nhap dich vu mien phi!");
                    freeService = scanner.nextLine();
                } while (!regexUtils.validateOnlyText(freeService));

                facility = new Room(nameService,areaRoom,priceRental,maxPeople,rentalType,freeService);
                break;
            case 3:
                do {
                    System.out.println("Nhap tieu chuan phong!");
                    standard = scanner.nextLine();
                } while (!regexUtils.validateName(standard));

                do {
                    System.out.println("dien tich ho boi!");
                    areaPool = Integer.parseInt(scanner.nextLine());
                } while (!regexUtils.validateArea(String.valueOf(areaPool)));

                facility = new House(nameService,areaRoom,priceRental,maxPeople,rentalType,standard,areaPool);
                break;
            default:
                MainView.displayErrorChoice();
        }
        return facility;
    }

    public void displayListFacitily(LinkedHashMap<Facility,Integer> facilitys){
        if (facilitys.isEmpty()){
            System.out.println("Khong co ket qua");
        } else {
            for (Map.Entry<Facility,Integer> facility: facilitys.entrySet()) {
                Facility facility1 = facility.getKey();
                System.out.println(facility1 +" SLSD: "+facility.getValue());
            }
        }
    }

    public void displayList(List<Facility> facilitys){
        if (facilitys.isEmpty()){
            System.out.println("Khong co ket qua");
        } else {
            for (Facility facility: facilitys) {
                System.out.println(facility);
            }
        }
    }

    public String inputIdFacility(){
        String string;
        do {
            System.out.println("Nhap ID:");
            string = scanner.nextLine();
        } while (!regexUtils.validateIdFacility(string));
        return string;
    }
}
