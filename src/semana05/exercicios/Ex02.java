package semana05.exercicios;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        final float IMC_IDEAL_MINIMO = 18.5f;
        final float IMC_IDEAL_MAXIMO = 24.9f;

        System.out.print("Insira sua altura em metros: ");
        float altura = sc.nextFloat();

        System.out.print("Insira seu peso em Kg: ");
        float peso = sc.nextFloat();

        if (altura <= 0 || peso <= 0){
            System.out.println("Erro! Entrada inválida! Por favor, insira um número válido.");
            sc.close();
            return;
        }
    
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

        System.out.println("Você está em " + categoria + " (" + imc + " IMC).");
    
        if (imc < IMC_IDEAL_MINIMO || imc > IMC_IDEAL_MAXIMO) {
            float pesoIdeal = IMC_IDEAL_MAXIMO * (altura * altura);
            if (imc < IMC_IDEAL_MINIMO) {
                System.out.println("Para chegar em seu peso ideial você precisa ganhar " + (pesoIdeal - peso) + "Kg." );
            } else {
                System.out.println("Para chegar em seu peso ideial você precisa perder " + (peso - pesoIdeal) + "Kg." );
            }
        }
        sc.close();
    }
    }
    
    
    
    
    
    