package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    public void startGame(){

        int aiNumber = 0, playerGuess = 0;
        Scanner scanner = new Scanner(System.in);
        String answer;
        Random generator = new Random();
        aiNumber  = generator.nextInt(10) + 1;



            System.out.println("Program losuje liczbę od 1 do 10. Spróbuj ją zgadnąć!");
            while (aiNumber != playerGuess){

                System.out.print("Mój typ: ");

                playerGuess = scanner.nextInt();

                if (aiNumber == playerGuess) {
                     System.out.println("Gratulacje gra się kończy");
                  } else if (aiNumber < playerGuess) {
                        System.out.println("Podałeś za dużą wartość");
                } else {
                      System.out.println("Podałeś za małą wartość");
                 }
            } 


    } 
}