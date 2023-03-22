package semana05.exercicios;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        final float IMCIDEALMINIMO = 18.5f;
        final float IMCIDEALMAXIMO = 24.9f;

        System.out.print("Insira sua altura em metros: ");
        float altura = sc.nextFloat();
        System.out.print("Insira seu peso em Kg: ");
        float peso = sc.nextFloat();
    
        float imc = peso / (altura * altura);
        String categoria; 

        if (imc < 18.5) {
            categoria =  "Baixo peso";
        } else if (imc < 25f) {
            categoria =  "Peso normal";
        } else if (imc < 30f) {
            categoria =  "Excesso de peso";
        } else if (imc < 35f) {
            categoria =  "Obesidade de Classe 1";
        } else if (imc < 40f) {
            categoria = "Obesidade de Classe 2";
        } else {
            categoria = "Obesidade de Classe 3";
        }
        System.out.println("Você está em " + categoria + " (" + imc + " IMC)");
    
        if (imc < IMCIDEALMINIMO || imc > IMCIDEALMAXIMO) {
            float pesoIdeal = IMCIDEALMAXIMO * (altura * altura);
            if (imc < IMCIDEALMINIMO) {
                System.out.println("Você precisa ganhar " + (pesoIdeal - peso) + "Kg" );
            } else {
                System.out.println("Você precisa perder " + (peso - pesoIdeal) + "Kg" );
            }
        }
        sc.close();
    }
    }
    
    
    
    
    
    