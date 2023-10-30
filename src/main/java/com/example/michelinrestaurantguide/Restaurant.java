package com.example.michelinrestaurantguide;

public class Restaurant {
    private String name;
    private String url;
    private String location;
    private String cusine;
    private String address;

    public Restaurant(String name, String url, String location, String cusine, String address) {
        this.name = name;
        this.url = url;
        this.location = location;
        this.cusine = cusine;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCusine() {
        return cusine;
    }

    public void setCusine(String cusine) {
        this.cusine = cusine;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", location='" + location + '\'' +
                ", cusine='" + cusine + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
