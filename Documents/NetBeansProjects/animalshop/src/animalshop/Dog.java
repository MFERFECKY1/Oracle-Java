/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalshop;

/**
 *
 * @author 0608027604
 */
public class Dog {
    private String name;
    private String breed;
    private String barkNoise = "Woof";
    private double weight;
    
}
public Dog(String name, String breed, double weight){
    this.name = name;
    this.breed = breed;
    this.weight = weight;
}
