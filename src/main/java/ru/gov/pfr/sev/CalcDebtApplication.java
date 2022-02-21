package ru.gov.pfr.sev;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "ru.gov.pfr.sev" })
@EnableAutoConfiguration

public class CalcDebtApplication {
    public static void main(String[] args) {
        SpringApplication.run(CalcDebtApplication.class, args);

    }
}
