package com.telran.org.springbootdemo.controller;

import com.telran.org.springbootdemo.model.Coffee;
import com.telran.org.springbootdemo.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

//http://localhost:8080/coffees
@RestController
@RequestMapping("/coffees")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    //http://localhost:8080/coffees/21d27a39-86d6-4bfb-b205-4b72d7d2d220
    @GetMapping
    public Set<Coffee> getAll(){
        return coffeeService.getAll();
    }

    //http://localhost:8080/coffees
    @GetMapping("/{uuid}")
    public Coffee getById(@PathVariable String uuid){
        return coffeeService.getById(uuid);
    }

    @PostMapping
    public Coffee add(@RequestBody Coffee coffee){
        return coffeeService.add(coffee);
    }
}
