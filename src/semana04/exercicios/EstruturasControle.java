package semana04.exercicios;

public class EstruturasControle {
    public static void main(String[] args) {
        // if

        var idade = 19; // inferência 
        final int MAIOR_IDADE = 18;
        
        if (idade >= MAIOR_IDADE) {
            System.out.println("Maior de idade");
        }

        var ligado = false;

        if (ligado) {
            System.out.println("Está ligado");
        } else {
            System.out.println("Está desligado");
        }

        // switch 
        // char, byte, short, int
        // literal String
        // enum

        int n = 3;

        switch (n) {
            case 1:
                System.out.println("Número 1");
                break;
            case 2:
                System.out.println("Número 2");
                break;
            case 3:
                System.out.println("Número 3");
                break;
            default:
                System.out.println("Não identificado");
                break;
        }

        // loops
        // for, foreach, while, do while

        var contador = 0;
        do {
            System.out.println("Do while Ligado!!");
            contador++;
        } while (contador < 3);

        contador = 0;
        while(contador < 3){
            System.out.println("While Ligadoo!");
            contador ++;
        }

        // i = 0; 0 < 3; !
        // i = 1; 1 < 3; !
        // i = 2; 2 < 3; !
        // i = 3; 3 < 3; 

        // Arrey
        // via index - numero inteiro
        // tamanho fixo no momento da criação

        // nomes = [_____, _____, _____]
        //            0      1      2

        String[] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "Marta";
        nomes[2] = "Marcia";
        /* 
            nomes [
                   ['M', 'a', 'r', 'i', 'a'], 
                   ['M', 'a', 'r', 't', 'a'], 
                   ['M', 'a', 'r', 'c', 'i', 'a']
                  ]
        */

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        // foreach 
        for (String nome : nomes) {
            System.out.println(nome);
        }

        for (String nome : nomes) {
            for (char letra : nome.toCharArray()){
                System.out.println(letra);
            }
            System.out.println(nome);
        }

        int[] numeros = {1, 2, 5, 0};
        for (int numero : numeros) {
            System.out.println(numero);
        }

    }
}
