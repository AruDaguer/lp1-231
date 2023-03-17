package semana04.exercicios.exercicio04;

public class ValidacaoCodigo {

    public boolean validacao(String codigo){

        if (codigo.length() != 7){
            return false;
        }
        if (! codigo.startsWith("BR")){
            return false;
        }
        if (! codigo.endsWith("X")){
            return false;
        }

        String numero = codigo.substring(2, 6);

        try{
            int n = Integer.parseInt(numero);

        } catch (NumberFormatException e){
            return false;
        }

        return true;
        
    }
    
}
