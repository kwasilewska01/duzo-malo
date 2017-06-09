package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
       Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        String answer;

             do {
            game.startGame();
            System.out.println("Czy chcesz zagrać jeszcze raz? T/N");
            answer = scanner.nextLine();


        } while (answer.equalsIgnoreCase("T")); 

        System.out.println("Pa Pa");




    } 
}
