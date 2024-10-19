package com.example.demo.controller;

import static org.springframework.http.HttpStatus.OK;

import com.example.demo.model.entity.Hello;
import com.example.demo.service.HelloService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {

    private final HelloService helloService;

    @ResponseStatus(OK)
    @GetMapping("/{id}")
    public ResponseEntity<Hello> findById(@PathVariable Long id) {
        return ResponseEntity.status(OK).body(helloService.findById(id).orElse(null));
    }

    @ResponseStatus(OK)
    @GetMapping
    public ResponseEntity<List<Hello>> findAll() {
        return ResponseEntity.status(OK).body(helloService.findAll());
    }

}
