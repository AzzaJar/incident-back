package com.example.demo.services;

import com.example.demo.persistance.entities.Province;

import java.util.List;

public interface ProvinceService {
    public void save(Province province);
    public void deleteByID(long id );
    public List<Province> findAll() ;
    public  Province findByID(long id );
}
