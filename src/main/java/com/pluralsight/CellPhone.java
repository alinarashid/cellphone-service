package com.pluralsight;

/**
 * CellPhone: the blueprint for a phone.
 * Every CellPhone object has the same fields,
 * but each one stores its own values.
 */

public class CellPhone {

    // Fields: private, so only this class can touch them directly
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;


    // Constructor with no parameters: builds a blank phone with default values
    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";

    }


    // Getters: read a field's value from outside the class
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


    // Setters: change a field's value from outside the class
    // this.field = the object's own field, right side = the parameter passed in
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


    // Action method: this phone calls another number.
    // Not static because it uses this.owner (this specific phone's data).
    // It only prints; it doesn't change any fields.
    public void dial(String phoneNumber) {
        System.out.println(this.owner + "'s phone is calling " + phoneNumber);
    }
}
