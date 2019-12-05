package com.example.demo.services;

import com.example.demo.persistance.entities.Secteur;

import java.util.List;

public interface SecteurService  {
    public void save(Secteur secteur );
    public void deleteByID(long id );
    public List<Secteur> findAll() ;
    public  Secteur findByID(long id );
}
