package com.sopra.steria.jpinternational.dao.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatabaseContextHolder {

    private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseContextHolder.class);

    private static final ThreadLocal<DatabaseType> contextHolder = new ThreadLocal<DatabaseType>();
    
    private DatabaseContextHolder() {   
        // this is constructor
       }

    public static void setDatabaseType(DatabaseType databaseType) {
        contextHolder.set(databaseType);
        LOGGER.debug("Switch on datasource [", databaseType, "]");
    }

   

    public static DatabaseType getDatabaseType() {
        return contextHolder.get();
    }

    public static void clearDatabaseType() {
        contextHolder.remove();
    }
}
