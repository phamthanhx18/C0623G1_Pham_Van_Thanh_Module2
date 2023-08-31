package controller;

import model.Facility.Facility;
import service.IFacilityService;
import service.impl.FacilityServiceImpl;

import java.util.LinkedHashMap;
import java.util.List;

public class FalicityController {
    IFacilityService facilityService = new FacilityServiceImpl();

    public List<Facility> displayFacilityMaintenance() {
        return facilityService.displayFacilityMaintenance();
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
