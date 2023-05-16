package semana03;

import java.util.Scanner;

public class Introducao {
    
    public static void main(String[] args) {
        // comentario linha

        /* 
         *  comentario de multiplas linhas!!
         */

         // Tipos Primitivos

         // Inteiros
         // byte, short, int, long

         byte n1 = 100; // 1 byte - -128 a 127
         short n2 = 3000; // 2 bytes - -32768 a 32767
         int n3 = 4000000; //  4 bytes - 2 bilhoes
         long n4 = 3232323232323L; // 8 bytes
         // System.out.println(n1);
         // System.out.println(n2);
         // System.out.println(n3);
         // System.out.println(n4);

         // Ponto Flutuante 
         // float, double
         float nota1 = 9.5f; // 4 bytes 
         double nota2 = 9.6; // 8 bytes 
         // System.out.println(nota1);
         // System.out.println(nota2);

         // char
         char letra = 'A';
         // System.out.println(letra);

         // boolean
         boolean ligado = true;
         boolean teste = false;
         // System.out.println(ligado);
         // System.out.println(teste);

         // String
         String palavra = "Olá Mundo";
         // System.out.println(palavra.toLowerCase());
         // System.out.println(palavra.toUpperCase());

         // Variáveis e constantes
         // Variáveis 
         // TIPO nome = valor;
         // TIPO nome;
         // nome = valor;

         // short idade = 15;

         short idade2;
         idade2 = 30;

         // Java 10 - Inferência de tipos
         // var sobrenome = "Santos";
         // var idade3 = 45;
         
         // Constantes
         // final TIPO NOME =  valor;
         // final double TESTE = 30.4;

         // Entrada e saída de dados
         // sout enter = System.out.println();

         Scanner sc = new Scanner(System.in);
         //Caneta caneta = new Caneta(Azul):

         System.out.println("Entre com seu nome: ");
         String nomeInformado = sc.nextLine();

         System.out.println("Entre com sua idade: ");
         short idadeInformada = sc.nextShort();

         System.out.println(nomeInformado + " " + idadeInformada);

         sc.close(); 



    }
}
