package model.Facility;

public class Villa extends Facility {
    private static int countVilla = 0;
    private String standard;
    private int areaPool;
    private int numberFloors;

    public Villa(String nameService, int areaRoom, float priceRental, int maxPeople, int rentalType, String standard, int areaPool, int numberFloors) {
        super(nameService, areaRoom, priceRental, maxPeople, rentalType);
        countVilla++;
        this.setIdService("SVVL-" + String.format("%04d", countVilla));
        this.standard = standard;
        this.areaPool = areaPool;
        this.numberFloors = numberFloors;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "idService=" + getIdService() +
                ", nameService='" + getNameService() + '\'' +
                ", areaRoom=" + getAreaRoom() +
                ", priceRental=" + getPriceRental() +
                ", maxPeople=" + getMaxPeople() +
                ", rentalType=" + getRentalType() +
                ", standard='" + getStandard() + '\'' +
                ", areaPool=" + getAreaPool() +
                ", numberFloors=" + getNumberFloors() +
                '}';
    }
}
