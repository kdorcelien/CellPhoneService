package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";

    }
    public int getSerialNumber(){
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

    public void dial(String phoneNumber){
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter phone number: ");
        String pNumber2 = input2.nextLine();
        System.out.println(owner +"'s phone is calling " + pNumber2);
    }
}
