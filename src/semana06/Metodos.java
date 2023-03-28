package semana06;

public class Metodos {
    public static void main(String[] args) {
       System.out.println(Math.sqrt(25.0));  
       imprimirPalavra("Olá Mundo!");  
       imprimirPalavra("testeteste");

       double soma = Calculadora.somar(35.5, 5.5);
       double subtracao = Calculadora.subtrair(35.5,5.5 );
       double multiplicacao = Calculadora.multiplicar(35.5,5.5 );
       double divisao = Calculadora.dividir(35.5,5.5 );

       System.out.println("A soma de 35.5 e 5.5: " + soma);
       System.out.println("A subtração de 35.5 e 5.5: " + subtracao);
       System.out.println("A multiplicação de 35.5 e 5.5: " + multiplicacao);
       System.out.println("A divisão de 35.5 e 5.5: " + divisao);
    }

    // Assinatura do método
    // public - acesso em qualquer parte do projeto 
    // static - método atrelado a classe (não precosa criar um objeto)
    // void - tipo de retorno (sem retorno)
    // imprimirPalavra - nome método
    //String palavra - parâmetro (pode ter 0 ou N)

    //Definindo método
    public static void imprimirPalavra(String palavra) {
        System.out.println(palavra.toUpperCase());
    }


}
