/**
 * @author Camila Silva
 * @since Classe criada em 11/03/2022
 * automated test with Junit
 */


package PuzzleGame;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camila
 */
public class MouseTest {

    
    //instantiating class Mouse
    Mouse g = new Mouse();

    @Before
    public void setUp() {
    }

    /**
     * Test of MouseClick method, of class Mouse.
     */
    @Test
    public void testMouseClick() {
        
        for(int i = 0; i < 4; i++){
            
            g.click++;
        }
        
        assertEquals(4, g.click);

        testResetMouseClick();
       
    }

    /**
     * Test of ResetMouseClick method, of class Mouse.
     */
    @Test
    public void testResetMouseClick() {
       
        g.click = 0;
        assertEquals(0, g.click);
    }
    
}


