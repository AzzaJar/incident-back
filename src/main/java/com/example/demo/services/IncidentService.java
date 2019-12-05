package com.example.demo.services;

import com.example.demo.persistance.entities.Incident;
import com.example.demo.persistance.entities.Secteur;
import com.example.demo.utils.CustomFilter;

import java.util.List;

public interface IncidentService {
    public void save(Incident incident);
    public void deleteByID(long id );
    public List<Incident> findAll() ;
    public  Incident findByID(long id );
    public List<Incident> findBySecteur(Secteur secteur);
    List<Incident> findByQuery(String field, Object value);
    List<Incident> findByQuerySecteur(Secteur secteur);
    List<Incident> findByQueryCM(CustomFilter customFilter);
    List<Incident> findByQueryBonus(CustomFilter customFilter, String condition);


}
