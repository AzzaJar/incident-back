package com.example.demo.services.impl;

import com.example.demo.persistance.repositories.IncidentRepository;
import com.example.demo.persistance.entities.Incident;
import com.example.demo.persistance.entities.Secteur;
import com.example.demo.services.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidentServiceImpl implements IncidentService {
    @Autowired
    IncidentRepository incidentRepository;

    @Override
    public void save(Incident incident) {
        incidentRepository.save(incident);

    }

    @Override
    public void deleteByID(long id) {

        incidentRepository.deleteById(id);


    }

    @Override
    public Incident findByID(long id) {
        return incidentRepository.findById(id);
    }

    @Override
    public List<Incident> findBySecteur(Secteur secteur) {
        return incidentRepository.findBySecteur(secteur);
    }


    @Override
    public List<Incident> findAll() {
        return incidentRepository.findAll();

    }
}
