package org.example.service;

import org.example.Model.Utilisateur;
import org.example.Repository.UtilisateurRepository;

public class ServiceUtilisateur {
    private UtilisateurRepository utilisateurRepository;
    public ServiceUtilisateur(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }
    public Utilisateur ajouter(String nom) {
        Utilisateur nv_user = new Utilisateur(generateId(), nom);
        return utilisateurRepository.save(nv_user);
    }
    private String generateId() {

        return "ID_" + System.currentTimeMillis();
    }
}