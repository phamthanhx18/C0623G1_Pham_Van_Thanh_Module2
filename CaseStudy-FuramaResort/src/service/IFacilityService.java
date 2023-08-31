package service;

import model.Facility.Facility;

import java.util.LinkedHashMap;

public interface IFacilityService extends IService<Facility>{
    void del(String id);
    void displayFacilityMaintenance();

    LinkedHashMap<Facility,Integer> integerLinkedHashMap();

}
