package com.example.demo.controller;

import com.example.demo.persistance.entities.Type;
import com.example.demo.services.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping(value = "Type")
@CrossOrigin("*")
@RestController
public class TypeController {

    @Autowired
    TypeService typeService;
    @GetMapping(value = "/find/all")
    public List<Type> findAll(){
        return typeService.findAll();
    }
    @GetMapping(value = "/find/{id}")
    public Type findByID(@PathVariable long id ){
        return typeService.findByID(id);
    }
}
