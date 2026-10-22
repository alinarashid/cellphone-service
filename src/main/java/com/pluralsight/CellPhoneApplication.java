package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {

        // Build a blank cellphone
        CellPhone myCellPhone = new CellPhone();

        //Fill it with setters
        myCellPhone.setSerialNumber(1234);
        myCellPhone.setModel("ABC");
        myCellPhone.setCarrier("xyz");
        myCellPhone.setPhoneNumber("000-000-0000");
        myCellPhone.setOwner("Alina");

        // Read it back with getters
        System.out.println("Serial Number: " + myCellPhone.getSerialNumber());
        System.out.println("Model: " + myCellPhone.getModel());
        System.out.println("Carrier: " + myCellPhone.getCarrier());
        System.out.println("Phone Number: " + myCellPhone.getPhoneNumber());
        System.out.println("Owner: " + myCellPhone.getOwner());

    }
}
