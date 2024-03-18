package com.xworkz.techApp.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.util.Properties;

@EnableWebMvc  //
@Configuration
@ComponentScan(basePackages = "com.xworkz.techApp")
@PropertySource("classpath:connection.properties")
public class TechnologyConfiguration {

    @Autowired
    Environment environment;

    public TechnologyConfiguration() {
        System.out.println("Constructor of TechnologyConfiguration");
    }

    @Bean
    public ViewResolver getViewResolver() {

        return new InternalResourceViewResolver("/", ".jsp");
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setDataSource(dataSource());

        bean.setPackagesToScan(new String[] {"com.xworkz.techApp.dto"});

        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        bean.setJpaVendorAdapter(adapter);
        bean.setJpaProperties(getHibernateProperties());

        return bean;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/passport");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("Xworkzodc@123");

        driverManagerDataSource.setConnectionProperties(getHibernateProperties());
        return  driverManagerDataSource;
    }

    @Bean
    public Properties getHibernateProperties(){
        Properties hibernateProperties = new Properties();
        hibernateProperties.put("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
        hibernateProperties.put("hibernate.show_sql","true");
        hibernateProperties.put("hibernate.hdm2ddl.auto","update");

        return hibernateProperties;
    }
}
