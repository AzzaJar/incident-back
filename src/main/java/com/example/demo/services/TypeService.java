package com.example.demo.services;

import com.example.demo.persistance.entities.Type;

import java.util.List;

public interface TypeService {
    public void save(Type type);
    public void deleteByID(long id );
    public List<Type> findAll() ;
    public  Type findByID(long id );
}
