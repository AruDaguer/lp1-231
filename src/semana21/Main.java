package semana21;

import java.util.ArrayList;

// interface = contrato
// conjunto de métodos (somente assinatura sem corpo)
// classe concreta que IMPLEMENTA a interface

// classe abstrata FiguraGeometrica
// interface FiguraGeometrica

// Quadrado - lado - calcular Area e Perimetro
// Retangulo - base, altura - calcular Area e Perimetro
// Circulo ??
// ...

public class Main {
    public static void main(String[] args) {

        // Quadrado q1 = new Quadrado(10);
        // Quadrado q2 = new Quadrado(20);
        // Retangulo r1 = new Retangulo(10, 5);
        FiguraGeometrica f1 = new Quadrado(10);
        FiguraGeometrica f2 = new Quadrado(20);
        FiguraGeometrica f3 = new Retangulo(10, 5);
        FiguraGeometrica f4 = new Circulo(2);
    
        Tela tela = new Tela();
        // tela.addQuadrado(q1);
        // tela.addQuadrado(q2);
        // tela.addRetangulo(r1);
        tela.addFigura(f1);
        tela.addFigura(f2);
        tela.addFigura(f3);
        tela.addFigura(f4);

        System.out.println(tela.totalArea());
        System.out.println(tela.totalPerimetro());

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Pedro");

        String nome = nomes.get(1);
        System.out.println(nome);

        System.out.println(nomes.size());

        nomes.remove("Maria");


    }

}