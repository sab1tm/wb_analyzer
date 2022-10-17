package com.sab1tm.wb_analyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WbAnalyzerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WbAnalyzerApplication.class, args);
    }

}
