/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agechecker;
import java.util.Scanner;

/**
 *
 * @author 0608027604
 */
public class AgeChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int age;
        char holdLicense;
        
        System.out.print("please enter your age: ");
        age = in.nextInt();
        System.out.print("Do you hold a current driving license? ");
        holdLicense = in.next().charAt(0);
        
        if((age > 20) && (holdLicense == 'y'))
            System.out.println("You are an adult and can drive a car");
        else
            System.out.println("You are not an adult so you cannot drive a car");
        
        
    }
    
}
