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
public class Dog {
      private String name;
    private String breed;
    private String barkNoise= "Woof";
    private double weight;
    
    
public Dog(String name, String breed, double weight) {
    this.name= name;
    this.breed= breed;
    this.weight= weight;
    }

public Dog (String name, String breed, String noise, double weight) {
    this.name= name;
    this.breed= breed;
    barkNoise= noise;
    this.weight= weight;
    }      
public void displayName(){
}
public String getName()
{
    return name;
}
public void setName(String name) 
{
    this.name= name;
}
public String getBreed() 
{ 
    return breed;
}
public void setBreed(String breed) 
{
    this.breed= breed;
}
public double getWeight()
{
    return weight;
}
public void setWeight(double weight) 
{
    this.weight= weight;
}
public void bark(){ 
    System.out.println(barkNoise);
}
public void bark(String barkNoise)
{
    System.out.println(barkNoise);
}
}
