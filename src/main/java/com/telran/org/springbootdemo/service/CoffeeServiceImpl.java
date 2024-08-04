package com.telran.org.springbootdemo.service;

import com.telran.org.springbootdemo.model.Coffee;
import com.telran.org.springbootdemo.repository.CoffeeInMemoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CoffeeServiceImpl implements CoffeeService {

    @Autowired
    private CoffeeInMemoryRepository repository;

    @Override
    public Set<Coffee> getAll() {
        return repository.getAll();
    }

    @Override
    public Coffee getById(String uuid) {

        return repository.getById(uuid);
    }

    @Override
    public Coffee add(Coffee coffee) {

        return repository.add(coffee);
    }
}
