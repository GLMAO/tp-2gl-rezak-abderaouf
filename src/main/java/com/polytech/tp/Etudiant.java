package com.polytech.tp;

// Ajout de l'implémentation de l'interface Observer
public class Etudiant implements Observer { 
    private String nom;

    public Etudiant(String nom) {
        this.nom = nom;
    }

    // Laisse la méthode update existante, mais ajoute l'annotation @Override
    @Override 
    public void update(String message) {
        System.out.println("Notification pour l'étudiant " + nom + " : " + message);
    }
}