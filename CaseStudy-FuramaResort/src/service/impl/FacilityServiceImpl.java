package service.impl;

import model.Facility.Facility;
import repository.IFacilityRepository;
import repository.impl.FacilityRepositoryImpl;
import service.IFacilityService;

import java.util.LinkedHashMap;
import java.util.List;

public class FacilityServiceImpl implements IFacilityService {
    private final IFacilityRepository facilityRepository = new FacilityRepositoryImpl();
    @Override
    public void displayFacilityMaintenance() {
        facilityRepository.displayFacilityMaintenance();
    }

    @Override
    public void add(Facility facility) {
        facilityRepository.add(facility);
    }

    @Override
    public List<Facility> getList() {
        return facilityRepository.getList();
    }

    public LinkedHashMap<Facility,Integer> integerLinkedHashMap() {
        return facilityRepository.getListHashMap();
    }

    @Override
    public void del(String id) {
        facilityRepository.del(id);
    }
}
