package com.xworkz.techApp.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TechnologyWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {


    protected Class<?>[] getRootConfigClasses() {
        System.out.println("getRootConfigClasses");
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        System.out.println("getServletConfigClasses");
        return new Class[] {TechnologyConfiguration.class};
    }

    protected String[] getServletMappings() {
        System.out.println("getServletMappings");
        return new String[] {"/"};
    }
}
