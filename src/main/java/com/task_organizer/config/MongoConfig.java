package com.task_organizer.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {
    private static final String MONGO_DB_NAME = "embedded_db";

    @Bean
    public MongoTemplate mongoTemplate() {
        MongoClient mongoClient = MongoClients.create();
        return new  MongoTemplate(mongoClient, MONGO_DB_NAME);
    }
}
