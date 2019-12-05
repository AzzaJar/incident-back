package com.example.demo.utils;

import com.example.demo.persistance.entities.Province;
import com.example.demo.persistance.entities.Secteur;
import com.example.demo.persistance.entities.Type;

public class CustomFilter {

    private String statut;
    private Secteur secteur;
    private Province province;
    private Type type;

    public CustomFilter() {
    }

    public CustomFilter(String statut, Secteur secteur, Province province, Type type) {
        this.statut = statut;
        this.secteur = secteur;
        this.province = province;
        this.type = type;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
