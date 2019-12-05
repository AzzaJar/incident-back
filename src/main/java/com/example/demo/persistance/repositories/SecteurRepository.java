package com.example.demo.persistance.repositories;

import com.example.demo.persistance.entities.Secteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecteurRepository extends JpaRepository<Secteur,Long> {
    public Secteur findById(long id);
}
