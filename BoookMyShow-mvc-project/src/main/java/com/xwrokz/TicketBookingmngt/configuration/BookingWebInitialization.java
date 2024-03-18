package com.xwrokz.TicketBookingmngt.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BookingWebInitialization extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {BookingConfiguration.class};
    }

    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
