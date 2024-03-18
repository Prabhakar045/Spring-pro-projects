package com.Xworkz.SpringBeginning.Ecommerce;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.applet.AppletContext;

public class OrderTester {

    public static void main(String[] args) {
        ApplicationContext appletContext = new AnnotationConfigApplicationContext("com.Xworkz.SpringBeginning");
        Order order = appletContext.getBean(Order.class);

        System.out.println(order);
    }



}
