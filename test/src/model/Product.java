package model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private float price;
    private String manufacturer;
    private String detail;

    public Product() {}

    public Product(int id, String name, float price, String manufacturer, String detail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getManufacturer(String s) {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Product {" +
                "Id: " + id +
                ", Name: '" + name + '\'' +
                ", Price: " + price +
                ", Manufacturer: '" + manufacturer + '\'' +
                ", Detail: '" + detail + '\'' +
                '}';
    }
}
