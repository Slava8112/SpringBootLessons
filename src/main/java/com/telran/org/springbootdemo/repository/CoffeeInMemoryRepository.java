package com.telran.org.springbootdemo.repository;

import com.telran.org.springbootdemo.model.Coffee;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class CoffeeInMemoryRepository {

    private Map<String, Coffee> storage = new HashMap<>();

    public CoffeeInMemoryRepository() {
        init();
    }

    private void init() {
        Coffee cafe_ganador = new Coffee("Cafe Ganador");
        Coffee cafe_cereza = new Coffee("Cafe Cereza");
        Coffee cafe_lareno = new Coffee("Cafe Lareno");
        Coffee cafe_tres_pontas = new Coffee("Cafe Tres Pontas");

        storage.put(cafe_cereza.getId(),cafe_cereza);
        storage.put(cafe_ganador.getId(),cafe_ganador);
        storage.put(cafe_lareno.getId(),cafe_lareno);
        storage.put(cafe_tres_pontas.getId(),cafe_tres_pontas);
    }

    public Set<Coffee> getAll(){
        return new HashSet<>(storage.values());
    }

    public Coffee add(Coffee coffee) {
        Coffee newCoffee = new Coffee(coffee.getName());
        storage.put(newCoffee.getId(),newCoffee);
        return newCoffee;
    }
    public Coffee getById(String uuid) {
        return storage.get(uuid);
    }
}
