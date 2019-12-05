package com.example.demo.persistance.repositories;

import com.example.demo.persistance.entities.Incident;
import com.example.demo.persistance.entities.Province;
import com.example.demo.persistance.entities.Secteur;
import com.example.demo.persistance.entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IncidentRepository extends JpaRepository<Incident,Long> {
    public Incident findById(long Id);
    public List<Incident> findBySecteur(Secteur secteur);
    List<Incident> findByStatut(String statut);
    List<Incident> findByProvince(Province province);
    List<Incident> findByType(Type type);

    /*
    @Query("Select * from Incident i where i.statut = ?1")
    List<Incident> findByQuery(String statut, Secteur secteur, Province province, Type type);
*/

}
