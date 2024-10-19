package com.example.demo.service;

import com.example.demo.model.entity.Hello;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

public interface HelloService {

    Optional<Hello> findById(@NotNull Long id);

    List<Hello> findAll();
}
