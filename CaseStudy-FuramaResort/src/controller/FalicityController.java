package controller;

import model.Facility.Facility;
import service.IFacilityService;
import service.impl.FacilityServiceImpl;

import java.util.LinkedHashMap;

public class FalicityController {
    IFacilityService facilityService = new FacilityServiceImpl();

    public void displayFacilityMaintenance() {
        facilityService.displayFacilityMaintenance();
    }

    public void add(Facility facility) {
        facilityService.add(facility);
    }

    public LinkedHashMap<Facility,Integer> getList() {
        return facilityService.integerLinkedHashMap();
    }

    public void del(String id) {
        facilityService.del(id);
    }
}
