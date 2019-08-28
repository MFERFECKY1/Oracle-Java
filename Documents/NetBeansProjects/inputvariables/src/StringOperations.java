
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0608027604
 */
public class StringOperations {

/**
 *
 * @author 0608027604
 */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* String str1 = "Hello";
        String str2 = "Marek";
        String str3; //unitialized string
        
        str3 = "you are " + str2;
        System.out.println("Welcome: " + str3);
        System.out.println("Length: " + str1.length());
        System.out.println("Sub: " + str3.substring(0,5));
        //display a value in uppercase
        System.out.println("Upper: " + str2.toUpperCase());
        
        System.out.println(str1.compareTo(str2));
        //compare two strings to see if they are the same
        System.out.println(str1.equals(str2));*/
        
        Scanner in = new Scanner(System.in);
        boolean boolVal;
        byte byteVal;
        char charVal;
        short shortVal;
        int intVal;
        long longVal;
        float floatVal;
        double doubleVal;
        
        System.out.print("How old are you? ");
        String age = in.next();
        
        System.out.println("Enter a byte value ");
        String text = in.nextLine();
        
        System.out.println("Please enter a char value ");
        int num = in.nextInt();
        
        System.out.println("Please enter a short value ");
        double doubleval = in.nextDouble();
        
        
        
        
        
        
    }
    
}
