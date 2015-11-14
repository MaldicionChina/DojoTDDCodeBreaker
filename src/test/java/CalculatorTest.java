import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by alexis on 7/11/15.
 */
public class CalculatorTest {

    Calculator c = new Calculator();
    int resultado;

    @Test
    public void add_1_1(){
        int result = c.add(1,1); // Act
        assertEquals(2,result); // Assert
    }

    @Test
    public void add2_2(){
        int result = c.add(2,2); // Act
        assertEquals(4,result); // Assert
    }
}
