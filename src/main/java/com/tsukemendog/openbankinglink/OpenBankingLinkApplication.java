package com.tsukemendog.openbankinglink;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
public class OpenBankingLinkApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenBankingLinkApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(Environment environment) {
        return args -> {
            log.info("current imported properties profile : " + environment.getProperty("current-profile"));
        };
    }
}
