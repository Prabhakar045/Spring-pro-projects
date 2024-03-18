package com.xwrokz.NetflixApp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.xworkz.NetflixApp")
public class NetflixConfiguration {

    @Bean
    public  ViewResolver getViewResolver(){
        return  new InternalResourceViewResolver("/", ".jsp");

    }

    @Bean
    public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean(){
            LocalContainerEntityManagerFactoryBean bean =new LocalContainerEntityManagerFactoryBean();
            bean.setPersistenceUnitName("com.pkk");

            return  bean;
    }
}
