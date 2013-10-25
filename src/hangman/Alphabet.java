/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author Kellie
 */
public class Alphabet {
    
    char[] alphabetArray = new char[26];
    
    public Alphabet(){
    }
    
    public void Alphabet(){
        alphabetArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
    
    public void displayAlphabet(char letter){
        System.out.println("Available Letters: ");
        
        for(int i = 0; i < alphabetArray.length; i++){
            
            if ( alphabetArray[i] == letter){
                alphabetArray[i] = '_';
            }
            System.out.print(alphabetArray[i] + " ");
            
        }
        System.out.print("\n\n");
    }
    
}
