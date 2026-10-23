package com.pluralsight;
import java.util.Scanner;

/**
 * Cell Phone Service app.
 * Builds two phones from user input, displays both,
 * then has each phone dial the other.
 */

public class CellPhoneApplication {

    // Class-level Scanner so every method in this class can use it
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Phone 1: build a blank phone, then fill it with setters
        System.out.println("Enter info for phone 1:");
        CellPhone cellPhone1 = new CellPhone();
        // askQuestion returns a String,
        // so parseInt converts it to an int for the serial number

        cellPhone1.setSerialNumber(Integer.parseInt(askQuestion("What is the serial number? ")));
        cellPhone1.setModel(askQuestion("What model is the phone? "));
        cellPhone1.setCarrier(askQuestion("Who is the carrier? "));
        cellPhone1.setPhoneNumber(askQuestion("What is the phone number? "));
        cellPhone1.setOwner(askQuestion("Who is the owner of the phone? "));


        // Phone 2: a second, separate object from the same blueprint
        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setSerialNumber(Integer.parseInt(askQuestion("What is the serial number? ")));
        cellPhone2.setModel(askQuestion("What model is the phone? "));
        cellPhone2.setCarrier(askQuestion("Who is the carrier? "));
        cellPhone2.setPhoneNumber(askQuestion("What is the phone number? "));
        cellPhone2.setOwner(askQuestion("Who is the owner of the phone? "));

        // Same display method, used for each phone
        display(cellPhone1);
        display(cellPhone2);

        // Phones call each other: get the other phone's number, then dial it
        System.out.println();
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());
    }

    // Helper: shows a prompt, reads the answer, returns it trimmed.
    // Static because it doesn't belong to any one phone object.
    public static String askQuestion(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    // Helper: prints one phone's info using its getters.
    // Takes a whole CellPhone object as its parameter, so it works for any phone.
    public static void display(CellPhone phone) {

        // Read it back with getters
        System.out.println("\n---" + phone.getOwner() + "'s phone number---");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
    }
}