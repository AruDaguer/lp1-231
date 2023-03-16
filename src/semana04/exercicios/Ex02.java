package semana04.exercicios;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com três números inteiro: ");
        float numero = sc.nextFloat();
        float numero1 = sc.nextFloat();
        float numero2 = sc.nextFloat();

        System.out.println("Média Aritmética: " + ((numero + numero1 + numero2) / 3) );

        // System.out.format("Média Aritmética: %f", ((numero + numero1 + numero2) / 3) );

        sc.close();
    }
}
