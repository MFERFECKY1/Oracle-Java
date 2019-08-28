/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputvariables;
import java.util.Scanner;

/**
 *
 * @author 0608027604
 */
public class Inputvariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        boolean boolVal;
        byte byteVal;
        char charVal;
        short shortVal;
        int intVal;
        long longVal;
        float floatVal;
        double doubleVal;
        
        System.out.println("Please enter a boolean value: ");
        boolVal = in.nextBoolean();
        
        System.out.println("Please enter a byte value: ");
        byteVal = in.nextByte();
        
        System.out.println("PLease enter a char value: ");
        charVal = in.next().charAt(0);
        
        System.out.println("PLease enter a short value: ");
        shortVal = in.nextShort();
        
        in.close();
        System.out.println("boolean value: " + boolVal);
        System.out.println("byte value: " + byteVal);
        System.out.println("char value: " + charVal);
        System.out.println("short value: " + shortVal);
        
    }
    
}
