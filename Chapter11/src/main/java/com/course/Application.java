package com.course;


import ch.qos.logback.classic.joran.action.ConfigurationAction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PreDestroy;
import javax.security.auth.login.Configuration;

@SpringBootApplication(scanBasePackages = "com.course.cotroller")
@EnableScheduling
public class Application {

    private static ConfigurableApplicationContext configurableApplicationContext;

    public static void main(String[] args) {
        Application.configurableApplicationContext= SpringApplication.run(Application.class,args);
    }

    @PreDestroy
    public void close(){
        Application.configurableApplicationContext.close();
    }
}
