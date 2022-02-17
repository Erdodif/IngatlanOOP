package hu.petrik;

import java.time.LocalDateTime;

public class RealEstate {
    private String street;
    private String city;
    private int zip;
    private String state;
    private int beds;
    private int baths;
    private int sqFt;
    private String type;
    private LocalDateTime saleDate;
    private int price;
    private double longitude;
    private double latitude;

    public RealEstate(String line){
        String[] datas = line.split(",");
        this.street = datas[0];
        this.city = datas[1];
        this.zip = Integer.parseInt(datas[2]);
        this.state = datas[3];
        this.beds = Integer.parseInt(datas[4]);
        this.baths = Integer.parseInt(datas[5]);
        this.sqFt = Integer.parseInt(datas[6]);
        this.type = datas[7];
        this.price = Integer.parseInt(datas[9]);
        this.longitude = Double.parseDouble(datas[10].replace(',','.'));
        this.latitude = Double.parseDouble(datas[11].replace(',','.'));
    }

    //BOILERPLATE ( ఠൠఠ )ﾉ
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getBaths() {
        return baths;
    }

    public void setBaths(int baths) {
        this.baths = baths;
    }

    public int getSqFt() {
        return sqFt;
    }

    public void setSqFt(int sqFt) {
        this.sqFt = sqFt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDateTime saleDate) {
        this.saleDate = saleDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                ", state='" + state + '\'' +
                ", beds=" + beds +
                ", baths=" + baths +
                ", sqFt=" + sqFt +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }

}
