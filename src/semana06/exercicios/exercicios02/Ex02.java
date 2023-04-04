package semana06.exercicios.exercicios02;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira sua altura em metros: ");
        float altura = sc.nextFloat();

        System.out.print("Insira seu peso em Kg: ");
        float peso = sc.nextFloat();

        if (altura <= 0 || peso <= 0){
            System.out.println("Erro! Entrada inválida! Por favor, insira um número válido.");
            sc.close();
            return;
        }

        float imc = CalculoImc.CalcularImc(peso, altura);
        String categoria = CalculoImc.CalcularCategoria(imc);
        String pesoNormal = CalculoImc.CalcularPesoNormal(imc, altura, peso);

        System.out.println("Você está em " + categoria + " IMC =" + imc);
        System.out.println( pesoNormal );
    
        sc.close();
    }
}
