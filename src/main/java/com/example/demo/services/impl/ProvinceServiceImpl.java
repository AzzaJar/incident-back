package com.example.demo.services.impl;

import com.example.demo.persistance.repositories.ProvinceRepository;
import com.example.demo.persistance.entities.Province;
import com.example.demo.services.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceRepository provinceRepository;
    @Override
    public Province findByID(long id) {
        return  provinceRepository.findById(id);
    }

    @Override
    public List<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);

    }

    @Override
    public void deleteByID(long Id) {
        provinceRepository.deleteById(Id);
    }
}
