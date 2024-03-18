package com.Xworkz.SpringBeginning.dto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

    public static void main(String[] args) {
        // Create an application context using the configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext("com.Xworkz.SpringBeginning");

        // Retrieve beans from the context
        PatientDTO patient = context.getBean(PatientDTO.class);
        AddressDTO address = context.getBean(AddressDTO.class);

        // Print details
        System.out.println("Patient ID: " + patient.getId());
        System.out.println("Patient Name: " + patient.getPatientName());
        System.out.println("Patient Contact No: " + patient.getContactNo());

        System.out.println("Address Details:");
        System.out.println("House No: " + address.getHouseNo());
        System.out.println("Area: " + address.getArea());
        System.out.println("City: " + address.getCity());
        System.out.println("State: " + address.getState());
        System.out.println("Country: " + address.getCountry());
        System.out.println("Pincode: " + address.getPincode());
    }
}
