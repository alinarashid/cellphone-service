package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    // Class-level Scanner so every method in this class can use it
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Build a blank cellphone (no starter data)
        CellPhone myCellPhone = new CellPhone();

        // Ask each question and store the answer with a setter
        myCellPhone.setSerialNumber(Integer.parseInt(askQuestion("What is the serial number? ")));
        myCellPhone.setModel(askQuestion("What model is the phone? "));
        myCellPhone.setCarrier(askQuestion("Who is the carrier? "));
        myCellPhone.setPhoneNumber(askQuestion("What is the phone number? "));
        myCellPhone.setOwner(askQuestion("Who is the owner of the phone? "));

        // Read it back with getters
        System.out.println("\n");

        System.out.println("Serial Number: " + myCellPhone.getSerialNumber());
        System.out.println("Model: " + myCellPhone.getModel());
        System.out.println("Carrier: " + myCellPhone.getCarrier());
        System.out.println("Phone Number: " + myCellPhone.getPhoneNumber());
        System.out.println("Owner: " + myCellPhone.getOwner());
    }

    // Prints a prompt, reads the user's answer, returns it trimmed
    public static String askQuestion(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
}