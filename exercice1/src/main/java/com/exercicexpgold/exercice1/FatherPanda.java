/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicexpgold.exercice1;

/**
 *
 * @author kernel-mk
 */
public class FatherPanda {
    
    public boolean isPredator;
    
    protected int weight;
    
    private int age;

    public void eat() {  
    
        System.out.println("After each meal, Father Panda gains weight: " + weight);
    
        System.out.println("And his age is: " + age);
    
    }
}