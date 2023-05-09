package semana05.exercicios;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex01{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float temperaturaAmbiente = 0;
        float temperaturaDesejada = 0;
        float comprimento = 0; 
        float altura = 0;
        float largura = 0;

        try {
            System.out.println("Insira as dimensões do aquário em centimetros (comprimento x altura x largura): ");
            String input = sc.nextLine();

            System.out.print("Insira em °C a temperatura ambiente: ");
            temperaturaAmbiente = sc.nextFloat();

            System.out.print("Insira em °C a temperatura desejada: ");
            temperaturaDesejada = sc.nextFloat();

            String[] dimensao = input.split("x");

            comprimento = Float.parseFloat(dimensao[0]);
            altura = Float.parseFloat(dimensao[1]);
            largura = Float.parseFloat(dimensao[2]);

        } catch (InputMismatchException e) {
            System.out.print("\033[31m");
            System.out.println("Erro! Valor de temperatura inválido! Insira um número válido.");
            System.out.print("\033[0m");
            sc.close();
            return;

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.print("\033[31m");
            System.out.println("Erro! Valor de dimensão inválido! Insira os números válidos no formato (comprimento x altura x largura).");
            System.out.print("\033[0m");
            sc.close();
            return;
        }

    
        float volume = ((comprimento * altura * largura) / 1000);
        float potencia = (volume * 0.05f * (temperaturaAmbiente - temperaturaDesejada));

        System.out.println("Volume do aquário: " + volume + "L");
        System.out.println("Potência do termostato para manter a temperatura desejada: " + Math.abs(potencia) + " W");
        System.out.println("Filtragem necessária para manter a qualidade de água:");
        System.out.println("Mínima: " + (volume * 2) + "L");
        System.out.println("Máxima: " + (volume * 3) + "L");

        sc.close();

    }

} 
