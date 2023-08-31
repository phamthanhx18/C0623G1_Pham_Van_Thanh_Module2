package repository;

import model.Facility.Facility;

import java.util.LinkedHashMap;
import java.util.List;

public interface IFacilityRepository extends IRepository<Facility>{

    void del(String id);
    List<Facility> displayFacilityMaintenance();
    LinkedHashMap<Facility,Integer> getListHashMap();
}
