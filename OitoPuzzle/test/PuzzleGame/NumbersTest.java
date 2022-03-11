/**
 * @author Camila Silva
 * @since Classe criada em 11/03/2022
 * automated test with Junit
 */


package PuzzleGame;

import javax.swing.JButton;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class NumbersTest {
     
    Numbers n = new Numbers();

    String bt1, bt2;
        
    /**
     * Test of ChangingNumbers method, of class Numbers.
     */
    @Test
    public void testChangingNumbers() {

            bt1 = "Camila";
            bt2 = "";
            
            n.NumberTxt = bt2;
            
           assertEquals("", n.NumberTxt);
                  
       
    }
    
}
