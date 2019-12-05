package com.example.demo.services.impl;

import com.example.demo.persistance.repositories.TypeRepository;
import com.example.demo.persistance.entities.Type;
import com.example.demo.services.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeRepository typeRepository;
    @Override
    public Type findByID(long id) {
        return typeRepository.findById(id);
    }

    @Override
    public List<Type> findAll() {
        return typeRepository.findAll();
    }

    @Override
    public void save(Type type) {
        typeRepository.save(type);

    }

    @Override
    public void deleteByID(long Id) {
        typeRepository.deleteById(Id);
    }
}
