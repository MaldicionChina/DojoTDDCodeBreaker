/**
 * Created by alexis on 7/11/15.
 */
public class CodeBreaker {
    public String compare(int pensado,int original){
        String pensadoString = String.valueOf(pensado);
        String originalString = String.valueOf(original);

        if( pensado == original) {
            return "XXXX";
        }
        else if (pensadoString.charAt(0) == originalString.charAt(0)){
            return "X";
        }
        return "";

    }
}
