package com.exemplospringboot.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplospringboot.userdept.entities.Departament;
import com.exemplospringboot.userdept.repository.Dptrepository;

@RestController
@RequestMapping(value = "/departaments")

public class DptControllers {

    @Autowired
    private Dptrepository repository;

    @GetMapping
    public List<Departament> findAll() {
        List<Departament> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "{id}")
    public Departament findById(@PathVariable Long id) {

        Departament result = repository.findById(id).get();
        return result;
    }

    @PostMapping(value = "{id}")
    public Departament insert(@RequestBody Departament departament) {

        Departament result = repository.save(departament);
        return result;
    }

}