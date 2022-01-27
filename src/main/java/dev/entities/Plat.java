package dev.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plat {
    private Integer id;
    private String nom;
    private Integer prix;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    public Integer getId() {
        return id;
    }

    // constructeur vide pour jpa car j'ai créé un constructeur pour créer des plats
    public Plat() {
    }

    // constructeur pour faire tout un plat :)
    public Plat(String nom, Integer prix) {
        this.nom = nom;
        this.prix = prix;
    }


    // accesseurs
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Plat: " +
                "id = " + id +
                ", nom = '" + nom + '\'' +
                ", prix = " + prix;
    }
}
