package com.example.demo.services.impl;

import com.example.demo.persistance.repositories.IncidentRepository;
import com.example.demo.persistance.entities.Incident;
import com.example.demo.persistance.entities.Secteur;
import com.example.demo.persistance.specification.IncidentSpecification;
import com.example.demo.services.IncidentService;
import com.example.demo.utils.CustomFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidentServiceImpl implements IncidentService {

    public static final String AND = "and";
    public static final String OR = "or";

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

    public List<Incident> findByQuery(String field, Object value) {
        Specification<Incident> spec = IncidentSpecification.fieldEqual(field, value);
        return incidentRepository.findAll(spec);
    };

    public List<Incident> findByQuerySecteur(Secteur secteur) {
        Specification<Incident> spec = IncidentSpecification.secteurEqual(secteur);
        return incidentRepository.findAll(spec);
    };

    public List<Incident> findByQueryCM(CustomFilter customFilter) {
        Specification<Incident> spec = null;
        Specification<Incident> finalSpec = null;
        if (customFilter.getStatut() != null) {
            finalSpec = IncidentSpecification.statutEqual(customFilter.getStatut());
        }
        if (customFilter.getProvince() != null) {
            spec = IncidentSpecification.provinceEqual(customFilter.getProvince());
            finalSpec =  (finalSpec != null) ? finalSpec.and(spec) : spec;
        }
        if (customFilter.getSecteur() != null) {
            spec = IncidentSpecification.secteurEqual(customFilter.getSecteur());
            finalSpec =  (finalSpec != null) ? finalSpec.and(spec) : spec;
        }
        if (customFilter.getType() != null) {
            spec = IncidentSpecification.typeEqual(customFilter.getType());
            finalSpec =  (finalSpec != null) ? finalSpec.and(spec) : spec;
        }
        return incidentRepository.findAll(finalSpec);
    }

    public List<Incident> findByQueryBonus(CustomFilter customFilter, String condition) {
        if (AND.equals(condition)) {
            return findByQueryCM(customFilter);
        }
        else {
            Specification<Incident> spec = null;
            Specification<Incident> finalSpec = null;
            if (customFilter.getStatut() != null) {
                finalSpec = IncidentSpecification.statutEqual(customFilter.getStatut());
            }
            if (customFilter.getProvince() != null) {
                spec = IncidentSpecification.provinceEqual(customFilter.getProvince());
                finalSpec =  (finalSpec != null) ? finalSpec.or(spec) : spec;
            }
            if (customFilter.getSecteur() != null) {
                spec = IncidentSpecification.secteurEqual(customFilter.getSecteur());
                finalSpec =  (finalSpec != null) ? finalSpec.or(spec) : spec;
            }
            if (customFilter.getType() != null) {
                spec = IncidentSpecification.typeEqual(customFilter.getType());
                finalSpec =  (finalSpec != null) ? finalSpec.or(spec) : spec;
            }
            return incidentRepository.findAll(finalSpec);
        }
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
