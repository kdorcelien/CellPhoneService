package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CellPhone phone = new CellPhone();
        CellPhone phone2 = new CellPhone();
        CellPhone phone3 = new CellPhone(999, "iPhone", "Visibe", "0967", "Carl Max");

        phone2.setSerialNumber(888);
        phone2.setPhoneNumber("711");
        phone2.setOwner("Help Line");
        phone2.setCarrier("T-Mobile");
        phone2.setModel("Landline");


        System.out.println("What is the Phone serial number?: ");
        int sNumber = input.nextInt();
        input.nextLine();
         phone.setSerialNumber(sNumber);
        System.out.println(phone.getSerialNumber());

        System.out.println("What model is the phone?: ");
        String mPhone = input.nextLine();
        phone.setModel(mPhone);
        System.out.println(phone.getModel());

        System.out.println("Who is the carrier?: ");
        String pCarrier = input.nextLine();
        phone.setCarrier(pCarrier);
        System.out.println(phone.getCarrier());

        System.out.println("What is the phone number?: ");
        String pNumber = input.nextLine();
        phone.setPhoneNumber(pNumber);
        System.out.println(phone.getPhoneNumber());

        System.out.println("Who is the owner of the phone?: ");
        String pOwner = input.nextLine();
        phone.setOwner(pOwner);
        System.out.println(phone.getOwner());

        phone2.dial("(999) 555-1202");
        phone.dial(phone3.getPhoneNumber());

        display(phone);
        display(phone2);
        display(phone3);

        }
    public static void display(CellPhone phone) {
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
          }
    }

