package com.example.demo;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Incident", uniqueConstraints = {
        @UniqueConstraint(columnNames = "Id")})
public class Incident implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private Date date;
    private String description;
    private String ime;
    private float latitude;
    private float longitude;
    private String statut;
    private String photo;
    @ManyToOne
    private Secteur secteur;
    @ManyToOne
    private Type type;
    @ManyToOne
    private Province province;

    public Incident() {
    }

    public Incident(Date date, String description, String ime, float latitude, float longitude, String statut) {
        this.date = date;
        this.description = description;
        this.ime = ime;
        this.latitude = latitude;
        this.longitude = longitude;
        this.statut = statut;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }


}
