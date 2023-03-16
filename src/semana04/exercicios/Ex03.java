package semana04.exercicios;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escreva o valor da compra: ");
        double valor = sc.nextDouble();

        /*
         *   Compras entre R$ 0,01 e R$ 9,99 - 0% de desconto
         *   Compras entre R$ 10,00 e R$ 99,99 - 5% de desconto
         *   Compras entre R$ 100,00 e R$ 499,99 - 10% de desconto
         *   Compras iguais ou superiores a R$ 500,00 - 15% de desconto
         */

        double desconto = 0;

        if (valor >= 10 && valor <= 99.99){
            desconto = 0.05;
        } else if (valor >= 100 && valor <= 499.99){
            desconto = 0.10;
        } else if (valor >= 500){
            desconto = 0.15;
        }

        double valorFinal = valor - (valor * desconto);

        System.out.println("Desconto aplicado: " + (desconto * 100) + "%");
        System.out.println("Valor final: R$" + valorFinal );

        sc.close();
    }

}