package ru.gov.pfr.sev;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration
public class CalcDebtApplication {
    public static void main(String[] args) {
        SpringApplication.run(CalcDebtApplication.class, args);

    }
}
