package com.example.demo.controller;

import com.example.demo.persistance.entities.Secteur;
import com.example.demo.services.SecteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping(value = "Secteur")
@CrossOrigin("*")
@RestController
public class SecteurController {

    @Autowired
    SecteurService secteurService;
    @GetMapping(value = "/find/all")
    public List<Secteur> findAll(){
        return secteurService.findAll();
    }
    @GetMapping(value = "/find/{id}")
    public Secteur findByID(@PathVariable long id ){
        return secteurService.findByID(id);
    }
}
