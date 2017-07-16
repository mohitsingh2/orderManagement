package com.sopra.steria.jpinternational.dao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.sopra.steria.jpinternational.repository")
public class RepositoryConfig {

}
