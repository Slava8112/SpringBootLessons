package com.telran.org.springbootdemo.service;

import com.telran.org.springbootdemo.model.Coffee;

import java.util.Set;

public interface CoffeeService {

    Set<Coffee> getAll();

    Coffee getById(String uuid);

    Coffee add(Coffee coffee);
}
