package com.epam;

/**
 * Created by Любовь on 28.02.2016.
 */
public class Monitor extends Device {
    private int resolutionX;
    private int resolution;

    public Monitor(String manufacture, float price, String serialNumber, int resolutionX, int resolution) {
        super(manufacture, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Monitor:" +
                "manufactorer="+getManufacture() + ","+
                "price="+getPrice()+","+
                "serialNumber="+getSerialNumber()+","+
                "X=" + resolutionX +","+
                "Y=" + resolution;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Monitor monitor = (Monitor) o;

        if (resolutionX != monitor.resolutionX) return false;
        return resolution == monitor.resolution;

    }
    

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + resolution;
        return result;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolution() {
        return resolution;
    }
}
