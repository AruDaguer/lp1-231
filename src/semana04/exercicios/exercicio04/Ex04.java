package semana04.exercicios.exercicio04;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ValidacaoCodigo vl = new ValidacaoCodigo();

        System.out.println("Entre com o código: ");
        var codigo = sc.nextLine();

        if (vl.validacao(codigo)){
            System.out.println("Código válido");
        } else 
            System.out.println("Código inválido");
    
            sc.close();
        }

    }