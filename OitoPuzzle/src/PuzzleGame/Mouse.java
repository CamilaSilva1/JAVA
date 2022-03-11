/**
 * @author Camila Silva
 * @since Classe criada em 10/03/2022
 * Jogo dos oito utilizando Java
 * This class is responsible for managing mouse click verification
 */

//packages
package PuzzleGame;

//libraries
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mouse {
    
    //variables
    
    //mouse click
    int click = 0;
   
    
    //function to count the mouse click
    public void MouseClick(JLabel amounthTxt){
        
        //add value to variable
        click = click + 1;
        
        //changing the text to the amount of clicks
        amounthTxt.setText(Integer.toString(click));
    }
    
    //resetting the amounth clicks (JLabel as parameter)
    public void ResetMouseClick(JLabel amounthTxt){
        
        click = 0;
        
        amounthTxt.setText(Integer.toString(click));
        
    }

}
