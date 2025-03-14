package com.example.demo.entity;

import jakarta.validation.constraints.Pattern;

public class Address {
    private String detailedAddress;
    private String city;
    private String state;

    @Pattern(regexp = "^\\d{6}$", message = "Invalid Pincode format")
    private String pincode;

    // Getters and Setters
    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
