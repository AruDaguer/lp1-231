package semana07.exerciciosRevisao;

public class ExerciciosRevisao2 {
    
    /*
    Escreva um método estático em Java que recebe um número inteiro e devolve true se o número for par e false se for ímpar;
    Escreva um método estático em Java que recebe uma string e devolve a string invertida;
    Escreva um método estático em Java que recebe um array de inteiros e devolve a soma dos valores pares;
    Escreva um método estático em Java que recebe um array de inteiros e devolve a média dos valores ímpares;
    Escreva um método estático em Java que recebe um array de inteiros e devolve o maior valor ímpar;
    Escreva um método estático em Java que recebe um array de inteiros e devolve o menor valor par;
    Escreva um método estático em Java que recebe uma matriz de inteiros e devolve a soma de todos os valores da matriz;
    Escreva um método estático em Java que recebe uma matriz de inteiros e devolve a média aritmética simples dos valores da matriz;
    Escreva um método estático em Java que recebe uma matriz de inteiros e devolve o maior valor da matriz;
    Escreva um método estático em Java que recebe uma matriz de inteiros e devolve o menor valor da matriz.
     */

     public static boolean exercicio1 ( int n ) {
        if ( n % 2 == 0) {
            return true;
        } else {
            return false;
        }
     }

     public static String exercicio2 ( String array1 ) {
        String array2 = new String();
        for (int i = 0; i > array1.length(); i++) {
            array2.toCharArray()[ array1.length() - 1 - i] = array1.toCharArray()[i];
        }
        return array2;
     } 
}
