package repository;

import model.Facility.Facility;

public interface IFacilityRepository extends IRepository<Facility>{

    void del(String id);
    void displayFacilityMaintenance();
}
