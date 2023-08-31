package repository;

import model.Facility.Facility;

import java.util.LinkedHashMap;

public interface IFacilityRepository extends IRepository<Facility>{

    void del(String id);
    void displayFacilityMaintenance();
    LinkedHashMap<Facility,Integer> getListHashMap();
}
