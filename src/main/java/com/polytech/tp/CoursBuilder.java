package com.polytech.tp;

public class CoursBuilder {
    
    // ATTRIBUTS : Déclarez tous les champs (publics ou package-private)
    public String matiere;
    public String enseignant;
    public String salle;
    public String date;
    public String heureDebut;
    public boolean estOptionnel;
    public String niveau;
    public boolean necessiteProjecteur;

    // METHODES SETTER : Retournent `this` (interface fluide)
    public CoursBuilder setMatiere(String matiere) { 
        this.matiere = matiere;
        return this; 
    }
    public CoursBuilder setEnseignant(String enseignant) { 
        this.enseignant = enseignant;
        return this; 
    }
    public CoursBuilder setSalle(String salle) { 
        this.salle = salle;
        return this; 
    }
    public CoursBuilder setDate(String date) { 
        this.date = date;
        return this; 
    }
    public CoursBuilder setHeureDebut(String heureDebut) { 
        this.heureDebut = heureDebut;
        return this; 
    }
    public CoursBuilder setEstOptionnel(boolean estOptionnel) { 
        this.estOptionnel = estOptionnel;
        return this; 
    }
    public CoursBuilder setNiveau(String niveau) { 
        this.niveau = niveau;
        return this; 
    }
    public CoursBuilder setNecessiteProjecteur(boolean necessiteProjecteur) { 
        this.necessiteProjecteur = necessiteProjecteur;
        return this; 
    }
    
    // METHODE BUILD : Crée l'objet Cours final
    public Cours build() {
        // Appelle le constructeur package-private de Cours
        return new Cours(this); 
    }
}