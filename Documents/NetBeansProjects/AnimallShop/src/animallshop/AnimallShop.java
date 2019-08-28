/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animallshop;

/**
 *
 * @author 0608027604
 */
public class AnimallShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dog dog1= new Dog("Ace", "Beagle", 45.6);
        Dog dog2= new Dog("Bailey", "Boerboel", "arf-arf", 80.2);
    
    
    System.out.println("Dog name : " + dog1.getName());
    System.out.println("Dog breed : "+ dog1.getBreed());
    System.out.print("Bark noise: ");
    dog1.bark();
    System.out.println("Dog weight: "+ dog1.getWeight());
    
    System.out.println("Dog name  : "+ dog2.getName());
    System.out.println("Dog breed : "+ dog2.getBreed());
    System.out.print("Bark noise: ");
    dog2.bark();
    System.out.println("Dog weight: "+ dog2.getWeight());}

    
    
}
