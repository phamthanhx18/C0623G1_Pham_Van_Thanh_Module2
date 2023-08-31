package repository.impl;

import model.Facility.Facility;
import model.Facility.House;
import model.Facility.Room;
import model.Facility.Villa;
import repository.IFacilityRepository;
import utils.FileUtils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepositoryImpl implements IFacilityRepository {
    private final String pathFile = "D:\\CodeGym\\C0623G1_Pham_Van_Thanh_Module2\\CaseStudy-FuramaResort\\src\\data\\data-facility.csv";
    private final String COMMA = ",";

    @Override
    public void displayFacilityMaintenance() {
        System.out.println("Đang thực hiện");
    }

    @Override
    public void add(Facility facility) {
        LinkedHashMap<Facility,Integer> facilityList = getListHashMap();
        facilityList.put(facility,0);
        FileUtils.writeFile(pathFile,convertToStringByHashMap(facilityList));
    }


    @Override
    public List<Facility> getList() {
        return convertToE(FileUtils.readFile(pathFile));
    }

    public LinkedHashMap<Facility,Integer> getListHashMap() {
       return convertToFacilityMap(FileUtils.readFile(pathFile));
    }

    @Override
    public void del(String id) {
        LinkedHashMap<Facility,Integer> facilityList = getListHashMap();
        for (Map.Entry<Facility,Integer> facility: facilityList.entrySet()) {
            Facility facility1 = facility.getKey();
            if (facility1.getIdService().equals(id)){
                System.out.println(facility);
                facilityList.remove(facility.getKey(),facility.getValue());
                break;
            }
        }
        FileUtils.writeFile(pathFile,convertToStringByHashMap(facilityList));
    }

    @Override
    public List<String> convertToString(List<Facility> facilityList) {
        List<String> strings = new ArrayList<>();
        String string;
        for (Facility facility : facilityList) {
            if (facility.getIdService().contains("SVHO")){
                House house = (House) facility;
                string = house.getIdService()+COMMA+
                        house.getNameService()+COMMA+
                        house.getAreaRoom()+COMMA+
                        house.getPriceRental()+COMMA+
                        house.getMaxPeople()+COMMA+
                        house.getRentalType()+COMMA+
                        house.getStandard()+COMMA+
                        house.getNumberFloors();
                strings.add(string);
            } else if (facility.getIdService().contains("SVRO")){
                Room room = (Room) facility;
                string = room.getIdService()+COMMA+
                        room.getNameService()+COMMA+
                        room.getAreaRoom()+COMMA+
                        room.getPriceRental()+COMMA+
                        room.getMaxPeople()+COMMA+
                        room.getRentalType()+COMMA+
                        room.getFreeService();
                strings.add(string);
            } else {
                Villa villa = (Villa) facility;
                string = villa.getIdService()+COMMA+
                        villa.getNameService()+COMMA+
                        villa.getAreaRoom()+COMMA+
                        villa.getPriceRental()+COMMA+
                        villa.getMaxPeople()+COMMA+
                        villa.getRentalType()+COMMA+
                        villa.getStandard()+COMMA+
                        villa.getAreaPool()+COMMA+
                        villa.getNumberFloors();
                strings.add(string);
            }
        }
        return strings;    }

    @Override
    public List<Facility> convertToE(List<String> strings) {
        List<Facility> facilityList = new ArrayList<>();
        for (String string : strings) {
            String[] data = string.split(COMMA);
            if (data[0].contains("SVHO")) {
                House house = new House(data[1], Integer.parseInt(data[2]), Float.parseFloat(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]), data[6], Integer.parseInt(data[7]));
                house.setIdService(data[0]);
                facilityList.add(house);
            } else if (data[0].contains("SVRO")) {
                Room room = new Room(data[1], Integer.parseInt(data[2]), Float.parseFloat(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]), data[6]);
                room.setIdService(data[0]);
                facilityList.add(room);
            } else {
                Villa villa = new Villa(data[1], Integer.parseInt(data[2]), Float.parseFloat(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]), data[6], Integer.parseInt(data[7]), Integer.parseInt(data[8]));
                villa.setIdService(data[0]);
                facilityList.add(villa);
            }
        }
        return facilityList;
    }


    public LinkedHashMap<Facility,Integer> convertToFacilityMap(List<String> strings) {
        LinkedHashMap<Facility,Integer> facilityList = new LinkedHashMap<>();
        for (String string : strings) {
            String[] data = string.split(COMMA);
            if (data[0].contains("SVHO")) {
                House house = new House(data[1], Integer.parseInt(data[2]), Float.parseFloat(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]), data[6], Integer.parseInt(data[7]));
                house.setIdService(data[0]);
                facilityList.put(house,Integer.parseInt(data[8]));
            } else if (data[0].contains("SVRO")) {
                Room room = new Room(data[1], Integer.parseInt(data[2]), Float.parseFloat(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]), data[6]);
                room.setIdService(data[0]);
                facilityList.put(room,Integer.parseInt(data[7]));
            } else {
                Villa villa = new Villa(data[1], Integer.parseInt(data[2]), Float.parseFloat(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]), data[6], Integer.parseInt(data[7]), Integer.parseInt(data[8]));
                villa.setIdService(data[0]);
                facilityList.put(villa,Integer.parseInt(data[9]));
            }
        }
        return facilityList;
    }

    public List<String> convertToStringByHashMap(LinkedHashMap<Facility,Integer> facilityList) {
        List<String> strings = new ArrayList<>();
        String string;
        for (Map.Entry facility : facilityList.entrySet()) {
            Facility facilityMap = (Facility) facility.getKey();
            if (facilityMap.getIdService().contains("SVHO")) {
                House house = (House) facilityMap;
                string = house.getIdService() + COMMA +
                        house.getNameService() + COMMA +
                        house.getAreaRoom() + COMMA +
                        house.getPriceRental() + COMMA +
                        house.getMaxPeople() + COMMA +
                        house.getRentalType() + COMMA +
                        house.getStandard() + COMMA +
                        house.getNumberFloors()+COMMA+
                        facility.getValue();
                strings.add(string);
            } else if (facilityMap.getIdService().contains("SVRO")) {
                Room room = (Room) facilityMap;
                string = room.getIdService() + COMMA +
                        room.getNameService() + COMMA +
                        room.getAreaRoom() + COMMA +
                        room.getPriceRental() + COMMA +
                        room.getMaxPeople() + COMMA +
                        room.getRentalType() + COMMA +
                        room.getFreeService()+COMMA+
                        facility.getValue();
                strings.add(string);
            } else {
                Villa villa = (Villa) facilityMap;
                string = villa.getIdService() + COMMA +
                        villa.getNameService() + COMMA +
                        villa.getAreaRoom() + COMMA +
                        villa.getPriceRental() + COMMA +
                        villa.getMaxPeople() + COMMA +
                        villa.getRentalType() + COMMA +
                        villa.getStandard() + COMMA +
                        villa.getAreaPool() + COMMA +
                        villa.getNumberFloors() +COMMA+
                        facility.getValue();
                strings.add(string);
            }
        }
        return strings;
    }
}

