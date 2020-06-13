package com.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
public class SpringBootMybatisSampleApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootMybatisSampleApplication.class, args);
  }

}
