package model.Facility;

public abstract class Facility {

    private String idService;
    private String nameService;
    private int areaRoom;
    private float priceRental;
    private int maxPeople;
    private int rentalType;

    // 1. thue theo nam, 2. Thue theo thang, 3. Thue theo ngay, 4. Thue theo gio
    public Facility() {
    }

    public Facility(String nameService, int areaRoom, float priceRental, int maxPeople, int rentalType) {
        this.nameService = nameService;
        this.areaRoom = areaRoom;
        this.priceRental = priceRental;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getAreaRoom() {
        return areaRoom;
    }

    public void setAreaRoom(int areaRoom) {
        this.areaRoom = areaRoom;
    }

    public float getPriceRental() {
        return priceRental;
    }

    public void setPriceRental(float priceRental) {
        this.priceRental = priceRental;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public int getRentalType() {
        return rentalType;
    }

    public void setRentalType(int rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idService=" + idService +
                ", nameService='" + nameService + '\'' +
                ", areaRoom=" + areaRoom +
                ", priceRental=" + priceRental +
                ", maxPeople=" + maxPeople +
                ", rentalType=" + rentalType +
                '}';
    }
}
