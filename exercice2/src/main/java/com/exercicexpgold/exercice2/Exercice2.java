/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexpgold.exercice2;

/**
 *
 * @author kernel-mk
 */
public class Exercice2 {
    
    private int mySecretNumber = 10;
    
    // Déclaration de la variable d'instance nommée mySecretNumber avec une valeur initiale de 10

    private int secret;
    
    // Déclaration de la variable de référence nommée secret sans valeur initiale

    public void displaySecret(){
        
        // Déclaration de la méthode displaySecret
    
        mySecretNumber = 45;
        
        // Réaffectation de la valeur de la variable d'instance mySecretNumber à 45
    
        secret = mySecretNumber;
        
        // La variable de référence secret pointe maintenant vers la variable d'instance mySecretNumber
    
        System.out.println("Variable de référence accédant à la variable d'instance : " + secret);
        
        // Affichage de la valeur de la variable de référence (qui est la même que celle de la variable d'instance)
    
        System.out.println("Variable locale : " + mySecretNumber);
        
        // Affichage de la valeur de la variable d'instance (qui a été réaffectée à 45)
    
        secret = mySecretNumber;
        
        // La variable de référence secret pointe maintenant vers la variable locale (qui a la même valeur que la variable d'instance)
    
        System.out.println("Variable de référence accédant à la variable d'instance qui pointe vers la variable locale : " + secret);
        
        // Affichage de la valeur de la variable de référence (qui est la même que celle de la variable locale)
    }


    public static void main(String[] args) {
        
        Exercice2 notSoPrivate = new    Exercice2();
    
        // Création d'un objet nommé notSoPrivate de la classe RLVariables
    
        notSoPrivate.displaySecret();
        
        // Appel de la méthode displaySecret pour l'objet notSoPrivate
    }
}
