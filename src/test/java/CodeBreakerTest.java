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
        String pensado="1000";
        String original="1000";
        result = cb.compare(pensado,original);
        assertEquals("X X X X", result);

    }

    @Test
    public void allFailed(){
        cb = new CodeBreaker();
        String pensado="2222";
        String original="1000";
        result = cb.compare(pensado,original);
        assertEquals("       ", result);

    }
    @Test
    public void firstAssert(){
        cb = new CodeBreaker();
        String pensado="1222";
        String original="1000";
        result = cb.compare(pensado,original);
        assertEquals("X      ", result);

    }

    @Test
    public void firstPresent(){
        cb = new CodeBreaker();
        String pensado="2212";
        String original="1000";
        result = cb.compare(pensado,original);
        assertEquals("_      ", result);

    }

    @Test
    public void allPresent(){
        cb = new CodeBreaker();
        String pensado="1234";
        String original="4321";
        result = cb.compare(pensado,original);
        assertEquals("_ _ _ _", result);

    }


}
