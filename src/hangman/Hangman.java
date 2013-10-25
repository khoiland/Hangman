/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Kellie
 */
public class Hangman {

    String name;
    String instructions;

    public Hangman() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hangman myGame = new Hangman();
                
        // get the name of the player
        myGame.getName();

        // display the games instructions
        myGame.displayInstructions();
                
        MainMenu app = new MainMenu();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void getName() {
        // get the user's name
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        this.name = input.nextLine();

// welcome user to the game
        System.out.println("\n\t\t\t\t*Welcome " + this.name + "!*\n");
    }

    public void displayInstructions() {
// comes from class instrucitons
        Instructions Instructions = new Instructions();
        Instructions.displayInstructions();
        
    }
}


