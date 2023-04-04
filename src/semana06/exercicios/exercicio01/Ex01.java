package semana06.exercicios.exercicio01;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float temperaturaAmbiente = 0;
        float temperaturaDesejada = 0;
        float comprimento = 0; 
        float altura = 0;
        float largura = 0;

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

            float volume = CalculoAquario.calcularVolume(comprimento, altura, largura);
            float potencia = CalculoAquario.calcularPotencia(volume, temperaturaAmbiente, temperaturaDesejada);

            System.out.println("Volume do aquário: " + volume + "L");
            System.out.println("Potência do termostato: " + (Math.abs(potencia)) + "W");
            System.out.println("Filtragem necessária para manter a qualidade de água:");
            System.out.println("Mínima: " + CalculoAquario.calcularFiltragemMinima(volume) + "L");
            System.out.println("Máxima: " + CalculoAquario.calcularFiltragemMaxima(volume) + "L");

            sc.close();
    }
}
