package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IncidentRepository extends JpaRepository<Incident,Long> {
    public Incident findById(long Id);
    public List<Incident> findBySecteur(Secteur secteur);
    List<Incident> findByStatut(String statut);
    List<Incident> findByProvince(Province province);
    List<Incident> findByType(Type type);

    @Query("Select * from Incident i where i.statut = ?1")
    List<Incident> findByQuery(String statut, Secteur secteur, Province province, Type type);


}
