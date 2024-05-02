package org.example.Model;

public class Utilisateur {
    private String id;
    private String nom;
    public Utilisateur(String id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public String getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
}