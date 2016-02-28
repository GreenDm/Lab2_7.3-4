package com.epam;

/**
 * Created by Любовь on 28.02.2016.
 */
public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter (int speed , String mac){
        super("IBM",0,"ABC");
        this.speed=speed;
        this.mac=mac;
    }

    @Override
    public String toString() {
        return "EthernetAdapter:" +
                "manufactorer="+getManufacture() + ","+
                "price="+getPrice()+","+
                "serialNumber="+getSerialNumber()+","+
                "speed=" + speed + ","+
                "mac=" + mac;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (speed != that.speed) return false;
        return mac != null ? mac.equals(that.mac) : that.mac == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + speed;
        result = 31 * result + (mac != null ? mac.hashCode() : 0);
        return result;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }
}
