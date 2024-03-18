package com.Xworkz.SpringBeginning.CustomerMngt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerTester {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.Xworkz.SpringBeginning");
        CustomerDTO customerDTO = context.getBean(CustomerDTO.class);

        System.out.println(customerDTO);
    }
}
