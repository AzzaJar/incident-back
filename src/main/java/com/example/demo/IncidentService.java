package com.example.demo;

import java.util.List;

public interface IncidentService {
    public void save(Incident incident);
    public void deleteByID(long id );
    public List<Incident> findAll() ;
    public  Incident findByID(long id );
    public List<Incident> findBySecteur(Secteur secteur);


}
