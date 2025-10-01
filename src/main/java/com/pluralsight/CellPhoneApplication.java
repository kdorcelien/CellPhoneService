package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CellPhone phone = new CellPhone();

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


    }
}
