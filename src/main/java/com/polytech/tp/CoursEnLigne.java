package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {

    public CoursEnLigne(ICours cours) {
        super(cours); // Appelle le constructeur du décorateur abstrait
    }

    @Override
    public String getDescription() {
        // Récupère la description de base et ajoute le suffixe
        return super.getDescription() + " (En ligne)"; 
    }

    @Override
    public double getDuree() {
        // La durée ne change pas, on délègue
        return super.getDuree();
    }
}