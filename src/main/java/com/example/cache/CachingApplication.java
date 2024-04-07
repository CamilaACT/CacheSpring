package com.example.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//importar el cache
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching //cache importar p2
public class CachingApplication {

  public static void main(String[] args) {
    SpringApplication.run(CachingApplication.class, args);
  }

}
