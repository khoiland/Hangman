/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import javax.swing.JFrame;

/**
 *
 * @author Kellie
 */
public class Instructions extends JFrame{
    
    public Instructions(){
    }
    
    public void displayInstructions(){
        
        String instructions =
                "\n\t************************************************************************"
              + "\n\t* Welcome to the game of Hangman!                                      *"                            
              + "\n\t* The goal of the game is to guess letter's from the alphabet to find  *"
              + "\n\t* the correct invisible word. Each incorrect guess of a letter results *"
              + "\n\t* in a body part of the hangman being placed on the gallows.           *"
              + "\n\t* You will be playing against the computer, guess the correct letters  *"
              + "\n\t* in the invisible word before the man is fully hung on the gallows!   *"
              + "\n\t* Good Luck and Have Fun!                                              *"
              + "\n\t************************************************************************"
              + "\n";
        
        System.out.println(instructions);
    }
}
