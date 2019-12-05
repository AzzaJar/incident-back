package com.example.demo;

public class CustomFilter {

    private String statut;
    private Integer secteurId;
    private Long provinceId;
    private Integer typeIncidentId;

    public CustomFilter() {

    }

    public CustomFilter(String statut, Integer secteurId, Long provinceId, Integer typeIncidentId) {
        this.statut = statut;
        this.secteurId = secteurId;
        this.provinceId = provinceId;
        this.typeIncidentId = typeIncidentId;
    }
































































































    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Integer getSecteurId() {
        return secteurId;
    }

    public void setSecteurId(Integer secteurId) {
        this.secteurId = secteurId;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getTypeIncidentId() {
        return typeIncidentId;
    }

    public void setTypeIncidentId(Integer typeIncidentId) {
        this.typeIncidentId = typeIncidentId;
    }
}
