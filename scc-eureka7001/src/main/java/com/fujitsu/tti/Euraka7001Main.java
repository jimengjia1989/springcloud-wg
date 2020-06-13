package com.fujitsu.tti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Euraka7001Main {
    public static void main(String[] args) {
        SpringApplication.run(Euraka7001Main.class,args);
    }
}
