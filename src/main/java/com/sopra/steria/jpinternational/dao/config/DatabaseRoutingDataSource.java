package com.sopra.steria.jpinternational.dao.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


public class DatabaseRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DatabaseContextHolder.getDatabaseType();
    }

}