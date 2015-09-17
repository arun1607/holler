package com.holler.hollerapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import java.text.ParseException;

@SpringBootApplication
public class HollerApplication  extends SpringBootServletInitializer{

        public static void main(String[] args) throws ParseException {
            SpringApplication.run(HollerApplication.class, args);
        }
}
