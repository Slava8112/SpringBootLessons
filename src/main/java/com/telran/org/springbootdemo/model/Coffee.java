package com.telran.org.springbootdemo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Coffee {

    private final String id;

    private final String name;

    public Coffee(String id, String name) {
        this.id = id;
        this.name = name;

    }

    public Coffee(String name) {
        this(UUID.randomUUID().toString(),name);
    }
}
