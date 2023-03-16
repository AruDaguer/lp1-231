package semana04.exercicios;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int numero = sc.nextInt();

        System.out.println( "Antecessor: " + (numero - 1) + " Sucessor: " + (numero + 1));

        // System.out.format("Antecessor: %s Sucessor: %s", numero - 1, numero + 1);

        sc.close();

    }
    
}
