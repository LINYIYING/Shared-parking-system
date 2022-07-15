package com.park.pojo;

public class MyCar {
    private String name;

    private Integer id;

    private String brand;

    private String license;

    private String color;

    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MyCar{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", brand='" + brand + '\'' +
                ", license='" + license + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
