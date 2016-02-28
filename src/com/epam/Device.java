package com.epam;

/**
 * Created by Любовь on 28.02.2016.
 */
public class Device {
    private String manufacture;
    private float price;
    private String serialNumber;

    public Device(String manufacture, float price, String serialNumber) {
        this.manufacture = manufacture;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device:" +
                "manufacture='" + manufacture + ","+
                "price=" + price +","+
                "serialNumber='" + serialNumber;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        if (Float.compare(device.price, price) != 0) return false;
        if (manufacture != null ? !manufacture.equals(device.manufacture) : device.manufacture != null) return false;
        return serialNumber != null ? serialNumber.equals(device.serialNumber) : device.serialNumber == null;

    }

    @Override
    public int hashCode() {
        int result = manufacture != null ? manufacture.hashCode() : 0;
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        return result;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacture() {
        return manufacture;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
