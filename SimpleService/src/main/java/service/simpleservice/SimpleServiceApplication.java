package service.simpleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class SimpleServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(SimpleServiceApplication.class, args);
    }

}
