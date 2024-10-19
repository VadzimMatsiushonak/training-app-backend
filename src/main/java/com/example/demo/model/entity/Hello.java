package com.example.demo.model.entity;

import com.example.demo.model.entity.base.IdEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity(name = "hello")
public class Hello extends IdEntity {

    @Column(nullable = false)
    private String text;

}
