package com.example.demo.controller;

import com.example.demo.persistance.entities.Province;
import com.example.demo.services.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "Province")
@CrossOrigin("*")
@RestController
public class ProvineController {

    @Autowired
    ProvinceService provinceService;
    @GetMapping(value = "/find/all")
    public List<Province> findAll(){
        return provinceService.findAll();
    }
    @GetMapping(value = "/find/{id}")
    public Province findByID(@PathVariable long id ){
        return provinceService.findByID(id);
    }



}
