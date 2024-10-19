package com.example.demo;

import com.example.demo.model.entity.Hello;
import com.example.demo.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Application {

    @Autowired
    private HelloRepository helloRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void startup() {
        Hello entity1 = new Hello();
        entity1.setText("1. Hello World");
        helloRepository.save(entity1);
        Hello entity2 = new Hello();
        entity2.setText("2. Hello World");
        helloRepository.save(entity2);
        System.err.println("Application started");
    }

}
