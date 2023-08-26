package service;

import model.Facility.Facility;

public interface IFacilityService extends IService<Facility>{
    void del(String id);
    void displayFacilityMaintenance();

}
