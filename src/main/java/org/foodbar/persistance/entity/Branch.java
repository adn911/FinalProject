package org.foodbar.persistance.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by bakhtiar.galib on 4/20/15.
 */
@Embeddable
public class Branch {

    @Column(nullable = false, length = 99)
    private String name;

    @Column(nullable = true, length = 99)
    private String city;

    @Column(nullable = true, length = 99)
    private String street;

    @Column(nullable = true, length = 99)
    private String area;

    @Column(nullable = true, length = 99)
    private String latitude;

    @Column(nullable = true, length = 99)
    private String longtitude;

    @Column(nullable = true, length = 11)
    private String contactNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
