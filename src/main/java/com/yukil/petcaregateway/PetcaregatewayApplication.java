package com.yukil.petcaregateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PetcaregatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetcaregatewayApplication.class, args);
    }

}
