package com.pluralsight;

public class CellPhone {

    // Fields: private data
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;


    // Constructors: no params
    public CellPhone() {
        this.serialNumber =0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";

    }

    // Constructor: 5 params
    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    // Getters: take a value OUT
    public int getSerialNumber() {
        return this.serialNumber;
    }

    public String getModel() {
        return this.model;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getOwner() {
        return this.owner;
    }

    // Setters: put a value IN
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

}
