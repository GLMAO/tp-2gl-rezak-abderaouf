package com.polytech;

import com.polytech.tp.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Test Builder Pattern - Basic creation
        System.out.println("Testing Builder Pattern - Basic Creation:");
        CoursBuilder builder = new CoursBuilder();
        Cours coursBasic = builder
                .setMatiere("Génie Logiciel")
                .setEnseignant("Mr CDT MAZARI Oussama")
                .build();
        System.out.println("Basic Cours: " + coursBasic.getDescription());
        System.out.println("Matiere: " + coursBasic.getMatiere());
        System.out.println("Enseignant: " + coursBasic.getEnseignant());
        System.out.println();

        // Test Builder Pattern - Full attributes
        System.out.println("Testing Builder Pattern - Full Attributes:");
        Cours coursFull = new CoursBuilder()
                .setMatiere("Assurance Qualité")
                .setEnseignant("Mr CPT HARBI")
                .setSalle("D23")
                .setDate("2025-11-20")
                .setHeureDebut("15:30")
                .setEstOptionnel(false)
                .setNiveau("2A")
                .setNecessiteProjecteur(true)
                .build();
        System.out.println("Full Cours: " + coursFull.getDescription());
        System.out.println("Salle: " + coursFull.getSalle());
        System.out.println("Date: " + coursFull.getDate());
        System.out.println("Heure Debut: " + coursFull.getHeureDebut());
        System.out.println("Optionnel: " + coursFull.isEstOptionnel());
        System.out.println("Niveau: " + coursFull.getNiveau());
        System.out.println("Projecteur: " + coursFull.isNecessiteProjecteur());
        System.out.println();

        // Test Builder Pattern - Minimal attributes (check defaults/null handling)
        System.out.println("Testing Builder Pattern - Minimal Attributes:");
        Cours coursMinimal = new CoursBuilder().build();
        System.out.println("Minimal Cours Description (may have nulls): " + coursMinimal.getDescription());
        System.out.println();

        // Test Decorator Pattern - Single decoration
        System.out.println("Testing Decorator Pattern - Single Decoration:");
        ICours coursEnLigne = new CoursEnLigne(coursFull);
        System.out.println("Decorated Cours: " + coursEnLigne.getDescription());
        System.out.println("Duration: " + coursEnLigne.getDuree());
        System.out.println();

        // Test Decorator Pattern - Check if duration unchanged
        System.out.println("Testing Decorator Pattern - Duration Check:");
        System.out.println("Original Duration: " + coursFull.getDuree());
        System.out.println("Decorated Duration: " + coursEnLigne.getDuree());
        System.out.println();

        // Test Observer Pattern - Basic notification
        System.out.println("Testing Observer Pattern - Basic Notification:");
        GestionnaireEmploiDuTemps gestionnaire = new GestionnaireEmploiDuTemps();
        
        Etudiant etudiant1 = new Etudiant("Rezak");
        Etudiant etudiant2 = new Etudiant("Kelaiaia");  // Using Etudiant since Responsable doesn't implement Observer
        
        gestionnaire.attach(etudiant1);
        gestionnaire.attach(etudiant2);
        
        // Trigger a change to notify observers
        gestionnaire.setChangement("Changement de salle : A101 -> B202");
        System.out.println();

        // Test Observer Pattern - Multiple notifications and detach
        System.out.println("Testing Observer Pattern - Multiple Notifications and Detach:");
        gestionnaire.setChangement("Cours modifié : Nouvelle date");
        
        // Detach one and trigger again
        gestionnaire.detach(etudiant1);
        gestionnaire.setChangement("Cours annulé");
        System.out.println();

        // Test Observer Pattern - No observers
        System.out.println("Testing Observer Pattern - No Observers:");
        gestionnaire.detach(etudiant2);
        gestionnaire.setChangement("Autre changement - Pas de notifications attendues");
    }
}