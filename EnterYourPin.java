/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10531183;

import java.util.Scanner;

/**
 *
 * @author estherk
 */
public class EnterYourPin 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        
        System.out.println("WELCOME TO THE BANK OF MITCHELL.");
        System.out.println("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();
        
        while (entry != pin)
        {
            System.out.println("\nINCORRECT PIN, TRY AGAIN.");
            System.out.println("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }
        
        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
                
    }
    
    
}
