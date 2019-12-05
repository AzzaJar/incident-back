package com.example.demo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Secteur  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String secteur;
    @OneToMany(mappedBy = "secteur")
    private List<com.example.demo.Incident> Incident;



    public long getId() {
        return id;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public Secteur() {
    }

    public void setId(int id) {
        this.id = id;
    }


}
