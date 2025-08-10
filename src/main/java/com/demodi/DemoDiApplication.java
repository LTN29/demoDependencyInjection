package com.demodi;

import com.demodi.app.DIContainer;
import com.demodi.app.Nofication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoDiApplication.class, args);

        Nofication nofication = DIContainer.createNotification();
        nofication.send("Hello, Dependency Injection!");
    }



}
