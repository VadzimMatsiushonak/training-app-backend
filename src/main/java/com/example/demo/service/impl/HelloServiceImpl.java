package com.example.demo.service.impl;

import com.example.demo.model.entity.Hello;
import com.example.demo.repository.HelloRepository;
import com.example.demo.service.HelloService;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@RequiredArgsConstructor
@Validated
@Slf4j
@Service
public class HelloServiceImpl implements HelloService {

    private final HelloRepository repository;

    @Override
    public Optional<Hello> findById(@NotNull Long id) {
        log.info("HelloServiceImpl findById {}", id);

        return repository.findById(id);
    }

    @Override
    public List<Hello> findAll() {
        log.info("HelloServiceImpl findAll");

        return repository.findAll();
    }

}
