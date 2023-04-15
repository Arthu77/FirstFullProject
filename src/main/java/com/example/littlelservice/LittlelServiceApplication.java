package com.example.littlelservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.WebFault;

@SpringBootApplication
@WebFault
public class LittlelServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LittlelServiceApplication.class, args);
    }

}
