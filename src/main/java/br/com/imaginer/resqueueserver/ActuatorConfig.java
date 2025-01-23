package br.com.imaginer.resqueueserver;

import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class ActuatorConfig {

  private static final String APP = "ResQueue Server";
  private static final String VERSION = "1.0.0";
  private static final String DESCRIPTION = "Eureka Server from ResQueue";

  @Bean
  public InfoContributor customInfoContributor() {
    return builder -> {
      builder.withDetail("app", Map.of("name", APP, "version", VERSION));
      builder.withDetail("description", DESCRIPTION);
    };
  }

}
