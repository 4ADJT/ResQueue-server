package br.com.imaginer.resqueueserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ResqueueServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ResqueueServerApplication.class, args);
  }

}
