package com.xwrokz.NetflixApp.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class NetflixWebInitialization extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {NetflixConfiguration.class};
    }

    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
