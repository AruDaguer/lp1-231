package semana04.exercicios.exercicio04;

public class ValidacaoCodigo {

    public boolean validacao(String codigo) {

        if (codigo.length() != 7 || ! codigo.startsWith("BR") || ! codigo.endsWith("X")) {
            return false;
        }

        String numero = codigo.substring(2, 6);

        try{
            Integer.parseInt(numero);

        } catch (NumberFormatException e) {
            return false;
        }

        return true;
        
    }
    
}