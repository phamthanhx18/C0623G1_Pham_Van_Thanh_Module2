package service;

import model.Facility.Facility;

import java.util.LinkedHashMap;
import java.util.List;

public interface IFacilityService extends IService<Facility>{
    void del(String id);
    List<Facility> displayFacilityMaintenance();

    LinkedHashMap<Facility,Integer> integerLinkedHashMap();

}
