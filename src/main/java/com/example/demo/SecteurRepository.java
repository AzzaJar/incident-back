package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SecteurRepository extends JpaRepository<Secteur,Long> {
    public Secteur findById(long id);
}
