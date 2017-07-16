package com.sopra.steria.jpinternational.dao.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

@Configuration
@PropertySource("classpath:/sopra.properties")
public class SessionFactoryConfig {

    @Autowired
    private Environment env;
    @Autowired
    private DataSource dataSource;

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setHibernateProperties(hibernateProperties());

        return sessionFactory;
    }

    @SuppressWarnings("serial")
    private Properties hibernateProperties() {
        return new Properties() {
            {
                setProperty("hibernate.generate_statistics", env.getProperty("hibernate.generate_statistics"));
                setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
                setProperty("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
                setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
            }
        };
    }

}
