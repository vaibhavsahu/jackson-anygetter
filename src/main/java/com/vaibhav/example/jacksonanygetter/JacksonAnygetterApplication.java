package com.vaibhav.example.jacksonanygetter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JacksonAnygetterApplication {

    public static void main(String[] args) throws JsonProcessingException {

        //Object to JSON Serialization


        //JSON to Object Deserialization

        String json = "{\"name\":\"SampleJavaBean\",\"key1\":\"val1\",\"key2\":\"val2\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("Deserializing JSON to POJO");
        SampleJavaBean javaBean = objectMapper.readValue(json, SampleJavaBean.class);
        System.out.println("name: " + javaBean.getName() + ", properties:  "+ javaBean.getProperties());

        SpringApplication.run(JacksonAnygetterApplication.class, args);
    }

}
