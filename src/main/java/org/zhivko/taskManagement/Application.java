package org.zhivko.taskManagement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@PropertySource(
        value = {"classpath:production.properties", "classpath:local.properties"},
        ignoreResourceNotFound = true)
public class Application {

    //@Value("${application.timezone}")
    private String timezone = null;

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    void setTimeZone() {
        if(null!=timezone) {
            TimeZone.setDefault(TimeZone.getTimeZone(timezone));
        }
    }

}
