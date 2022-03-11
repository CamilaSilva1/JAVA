/**
 * @author Camila Silva
 * @since Classe criada em 10/03/2022
 * Jogo dos oito utilizando Java
 * This class is responsible for managing reset the buttons and their scrambling
 */


//packages
package PuzzleGame;

//libraries
import java.util.Random;

import javax.swing.JButton;


public class Reset {
    
    //function to reset the game and shuffle numbers
    public void resetGame(JButton btn1, JButton btn2, JButton btn3, JButton btn4,
                        JButton btn5, JButton btn6, JButton btn7,
                            JButton btn8, JButton btn9){
        
            //array with all the numbers
            int[] btnNum = new int[9];

            //verifying the lines of array
            int i, lineChecker;

            
            Boolean Flag = false;

            i = 1;

            do{
                //numbers randomics
                Random randomic = new Random();
                
                //assigning random numbers to array rows
                lineChecker = randomic.nextInt((8) + 1);   
                
                //scrambling the numbers
                for(int j = 1; j <= i; j++){
                    
                    if(btnNum[j] == lineChecker){
                        
                        Flag = true;
                        break;
                        
                    }
                }
                
                
                if(Flag == true){
                    
                    Flag = false;
                    
                }
                else{
                    
                    btnNum[i] = lineChecker;
                    i = i + 1;
                    
                }

            }while( i <= 8 );
            
           
            btn1.setText(Integer.toString(btnNum[1]));
            btn2.setText(Integer.toString(btnNum[2]));
            btn3.setText(Integer.toString(btnNum[3]));
            btn4.setText(Integer.toString(btnNum[4]));
            btn5.setText(Integer.toString(btnNum[5]));
            btn6.setText(Integer.toString(btnNum[6]));
            btn7.setText(Integer.toString(btnNum[7]));
            btn8.setText(Integer.toString(btnNum[8]));
            btn9.setText("");
            
    }
    

}
