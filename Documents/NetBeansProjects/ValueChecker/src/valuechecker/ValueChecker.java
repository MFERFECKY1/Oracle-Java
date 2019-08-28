/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valuechecker;

import java.util.Scanner;

/**
 *
 * @author 0608027604
 */
public class ValueChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner in = new Scanner(System.in);
        int value = 0;
      do{
        System.out.println("Please enter a number: ");
        value = in.nextInt();
        if( value == 7) {
            System.out.println("thats lucky!");
        }
        else if( value == 13) {
            System.out.println("Thats unlucky!");
        }
        else if(value!=0){
            System.out.println("That number is neither lucky nor unlucky!");
        }
    }while(value!=0);
      in.close();
    }
}
