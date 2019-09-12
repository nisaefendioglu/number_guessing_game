/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number_guessing_game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author NisaEfendioglu
 */
public class Number_guessing_game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Random rnd = new Random();
       System.out.println("Welcome!");
       System.out.print("Enter a number between 1-100.");
        int guess = input.nextInt();
        int number = rnd.nextInt(101);
        while (guess != number) {
    if(guess < 0 || guess > 100 ) {
       System.out.print("Enter a number between 1-100.");
        guess = input.nextInt(); }

    else if (guess < number) {
       System.out.print("Enter a larger number.");
        guess = input.nextInt(); }
    else{
       System.out.print("Enter a smaller number.");
        guess = input.nextInt();}
    }

       System.out.println("Congrulations!"); }
}
        // TODO code application logic here
    
