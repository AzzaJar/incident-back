package com.example.demo;

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
