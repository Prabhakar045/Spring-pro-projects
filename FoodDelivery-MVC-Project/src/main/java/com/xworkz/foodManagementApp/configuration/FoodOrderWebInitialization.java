package com.xworkz.foodManagementApp.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FoodOrderWebInitialization extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {FoodOrderConfiguration.class};
    }

    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
