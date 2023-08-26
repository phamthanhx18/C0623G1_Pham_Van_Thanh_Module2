package model.Facility;

public class House extends Facility {
    private static int countHouse = 0; // biến static để lưu trữ giá trị ID service
    private String standard;
    private int numberFloors;

    public House(String nameService, int areaRoom, float priceRental, int maxPeople, int rentalType, String standard, int numberFloors) {
        super(nameService, areaRoom, priceRental, maxPeople, rentalType);
        countHouse++;
        this.setIdService("SVHO-"+String.format("%04d", countHouse));
        this.standard = standard;
        this.numberFloors = numberFloors;
    }


    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "idService=" + getIdService() +
                ", nameService='" + getNameService() + '\'' +
                ", areaRoom=" + getAreaRoom() +
                ", priceRental=" + getPriceRental() +
                ", maxPeople=" + getMaxPeople() +
                ", rentalType=" + getRentalType() +
                ", standard='" + getStandard() + '\'' +
                ", numberFloors=" + getNumberFloors() +
                '}';
    }
}
