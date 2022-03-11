/**
 * @author Camila Silva
 * @since Classe criada em 10/03/2022
 * Jogo dos oito utilizando Java
 * This class is responsible for managing change place numbers 
 */

//packages
package PuzzleGame;

//libraries
import javax.swing.JButton;

public class Numbers {
    
    //function for check the space empty beetween the numbers and 
    //changing the place of numbers
    public void ChangingNumbers(JButton btn1, JButton btn2){
        
        //getting their text
        String NumberTxt = btn2.getText();
        
        //checking if the number its empty 
        if(NumberTxt == ""){
            
            //changing the text 
            btn2.setText(btn1.getText());
            btn1.setText("");
        }
    }

}
