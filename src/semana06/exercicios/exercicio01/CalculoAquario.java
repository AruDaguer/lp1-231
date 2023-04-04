package semana06.exercicios.exercicio01;

public class CalculoAquario {

    public static float calcularVolume(float comprimento, float altura, float largura) {
        float volume = ((comprimento * altura * largura) / 1000);
        return volume;
    }

    public static float calcularPotencia(float volume, float temperaturaAmbiente, float temperaturaDesejada) {
        float potencia = (volume * 0.05f * (temperaturaAmbiente - temperaturaDesejada));
        return potencia;
    }

    public static float calcularFiltragemMinima(float volume) {
        float filtragemMinima = volume * 2;
        return filtragemMinima;
    }

    public static float calcularFiltragemMaxima(float volume) {
        float filtragemMaxima = volume * 3;
        return filtragemMaxima;
    }
}

