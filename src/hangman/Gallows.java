/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author Kellie
 */
public class Gallows {
    
    public Gallows(){
    }
    
    public void displayGallows(int gallowsCase){
        
        switch(gallowsCase){
            case 6:
                System.out.println("\t\t_______"
                        + "\n\t\t|             |"
                        + "\n\t\t|             |"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n");
                break;
                
            case 5:
                System.out.println("\t\t_______"
                        + "\n\t\t|             |"
                        + "\n\t\t|             |"
                        + "\n\t\t|             0"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n");
                break;
                
            case 4:
                System.out.println("\t\t_______"
                        + "\n\t\t|             |"
                        + "\n\t\t|             |"
                        + "\n\t\t|             0"
                        + "\n\t\t|             |"
                        + "\n\t\t|             |"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n");
                break;
                
            case 3:
                System.out.println("\t\t_______"
                        + "\n\t\t|             |"
                        + "\n\t\t|             |"
                        + "\n\t\t|             0"
                        + "\n\t\t|            \\|"
                        + "\n\t\t|             |"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n");
                break;
                
            case 2:
                System.out.println("\t\t_______"
                        + "\n\t\t|             |"
                        + "\n\t\t|             |"
                        + "\n\t\t|             0"
                        + "\n\t\t|            \\|/"
                        + "\n\t\t|             |"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n");
               break;
                
            case 1:
                System.out.println("\t\t_______"
                        + "\n\t\t|             |"
                        + "\n\t\t|             |"
                        + "\n\t\t|             0"
                        + "\n\t\t|            \\|/"
                        + "\n\t\t|             |"
                        + "\n\t\t|            /"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n");
              break;
                
            case 0:
                System.out.println("\t\t_______"
                        + "\n\t\t|             |"
                        + "\n\t\t|             |"
                        + "\n\t\t|             0"
                        + "\n\t\t|            /|"
                        + "\n\t\t|             |"
                        + "\n\t\t|            / \\"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n\t\t|"
                        + "\n");
                break;
                
            default:
                System.out.println();                       
        }
    }
}
