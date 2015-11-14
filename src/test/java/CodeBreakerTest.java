import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by alexis on 7/11/15.
 */
public class CodeBreakerTest {
    CodeBreaker cb;
    String result;
    @Test
    public void allAssert(){
        cb = new CodeBreaker();
        result = cb.compare(1000,1000);
        assertEquals("XXXX", result);

    }

    @Test
    public void allFailed(){
        cb = new CodeBreaker();
        result = cb.compare(2222,1000);
        assertEquals("", result);

    }
    @Test
    public void oneAssert(){
        cb = new CodeBreaker();
        result = cb.compare(1222,1000);
        assertEquals("X", result);

    }



}
