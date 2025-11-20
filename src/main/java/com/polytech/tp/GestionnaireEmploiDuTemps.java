package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {
    
    private List<Observer> observers = new ArrayList<>();
    private String dernierChangement; // L'état à notifier (le message du changement)

    // Méthode pour déclencher la notification (appelée par TpTests.java)
    public void setChangement(String nouveauMessage) {
        this.dernierChangement = nouveauMessage;
        notifyObservers(); // Déclenche la notification
    }

    // --- Implémentation de Subject ---

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            // Passe le message du changement à chaque observateur
            observer.update(this.dernierChangement); 
        }
    }
}