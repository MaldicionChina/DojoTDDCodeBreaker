/**
 * Created by alexis on 7/11/15.
 */
public class CodeBreaker {
    public String compare(String pensado,String original){
        String retorno="";
        if( pensado == original) {
            retorno= "X X X X";
        }
        else{
            if (pensado.charAt(0) == original.charAt(0)){
                retorno += "X ";
            } else if(pensado.contains(original.substring(0,1))) {
                retorno += "_ ";
            }
            else{
                retorno += "  ";
            }
            if (pensado.charAt(1) == original.charAt(1)){
                retorno += "X ";
            } else if(pensado.contains(original.substring(1,2))) {
                retorno += "_ ";
            }
            else{
                retorno += "  ";
            }
            if (pensado.charAt(2) == original.charAt(2)){
                retorno += "X ";
            } else if(pensado.contains(original.substring(2,3))) {
                retorno += "_ ";
            }
            else{
                retorno += "  ";
            }
            if (pensado.charAt(3) == original.charAt(3)){
                retorno += "X";
            } else if(pensado.contains(original.substring(3,4))) {
                retorno += "_";
            }
            else{
                retorno += " ";
            }
        }

        return retorno;
    }
}
