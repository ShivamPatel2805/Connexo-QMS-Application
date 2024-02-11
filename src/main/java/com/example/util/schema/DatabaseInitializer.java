package com.example.util.schema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements ApplicationRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Check if the database exists
        if (!databaseExists()) {
            // Create the database
            createDatabase();
        }
    }

    private boolean databaseExists() {
        // Query to check if the database exists
        String query = "SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA WHERE SCHEMA_NAME = 'qms_database'";
        String result = jdbcTemplate.queryForObject(query, String.class);
        return result != null && result.equals("qms_database");
    }

    public void createDatabase() {
        // Create the database
        jdbcTemplate.execute("CREATE DATABASE IF NOT EXISTS qms_database");
    }
}