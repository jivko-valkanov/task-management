package org.zhivko.taskManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(
        value = {"classpath:production.properties", "classpath:local.properties"},
        ignoreResourceNotFound = true)
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

}
