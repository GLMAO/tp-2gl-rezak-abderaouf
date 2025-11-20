package com.polytech.tp;

public class Cours implements ICours {
    private String matiere;
    private String enseignant;
    private String salle;
    private String date;
    private String heureDebut;
    private boolean estOptionnel;
    private String niveau;
    private boolean necessiteProjecteur;

    // 1. CONSTRUCTEUR PUBLIC à 8 arguments (OBLIGATOIRE pour que TpTests.java compile)
    public Cours(String matiere, String enseignant, String salle, String date, 
                 String heureDebut, boolean estOptionnel, String niveau, boolean necessiteProjecteur) {
        this.matiere = matiere;
        this.enseignant = enseignant;
        this.salle = salle;
        this.date = date;
        this.heureDebut = heureDebut;
        this.estOptionnel = estOptionnel;
        this.niveau = niveau;
        this.necessiteProjecteur = necessiteProjecteur;
    }

    // 2. CONSTRUCTEUR PACKAGE-PRIVATE pour le BUILDER (SANS mot-clé `public` ou `private`)
    // Cela permet à CoursBuilder (dans le même package) d'y accéder.
    Cours(CoursBuilder builder) {
        this.matiere = builder.matiere;
        this.enseignant = builder.enseignant;
        this.salle = builder.salle;
        this.date = builder.date;
        this.heureDebut = builder.heureDebut;
        this.estOptionnel = builder.estOptionnel;
        this.niveau = builder.niveau;
        this.necessiteProjecteur = builder.necessiteProjecteur;
    }
    
    // Constructeur par défaut (pour la flexibilité, si nécessaire)
    public Cours() {
    }

    @Override
    public String getDescription() {
        return "Cours de " + matiere + " avec " + enseignant + " (" + salle + ")";
    }

    @Override
    public double getDuree() {
        return 1.5; // Durée par défaut
    }
    
    // --- Getters (OBLIGATOIRES pour les assertions de TpTests.java) ---
    public String getMatiere() { return matiere; }
    public String getEnseignant() { return enseignant; }
    public String getSalle() { return salle; }
    public String getDate() { return date; }
    public String getHeureDebut() { return heureDebut; }
    public boolean isEstOptionnel() { return estOptionnel; }
    public String getNiveau() { return niveau; }
    public boolean isNecessiteProjecteur() { return necessiteProjecteur; }
}