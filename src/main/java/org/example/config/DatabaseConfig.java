package org.example.config;

import org.sql2o.*;

public class DatabaseConfig {
    public static Sql2o getDatabaseConnection() {
        return new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "postgres", "123456");

    }
//    DatabaseConfig.getDatabaseConnection();
}
