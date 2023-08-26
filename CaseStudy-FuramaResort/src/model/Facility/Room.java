package model.Facility;

public class Room extends Facility {

    private static int countRoom = 0; // biến static để lưu trữ giá trị ID service
    private String freeService;

    public Room(String nameService, int areaRoom, float priceRental, int maxPeople, int rentalType, String freeService) {
        super(nameService, areaRoom, priceRental, maxPeople, rentalType);
        countRoom++;
        this.setIdService("SVRO-"+String.format("%04d", countRoom));
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "idService=" + getIdService() +
                ", nameService='" + getNameService() + '\'' +
                ", areaRoom=" + getAreaRoom() +
                ", priceRental=" + getPriceRental() +
                ", maxPeople=" + getMaxPeople() +
                ", rentalType=" + getRentalType() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
