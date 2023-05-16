package semana11.exercicios.exercicio01;

public class Aquario {
    double altura = 0.0;
    double comprimento = 0.0;
    double largura = 0.0;

    public double calcularVolume() {
        return ((comprimento * altura * largura) / 1000);
    }

    public double calcularPotenciaDoTermostato( double temperaturaAmbiente, double temperaturaDesejada ) {
        return (calcularVolume() * 0.05 * (temperaturaAmbiente - temperaturaDesejada)); 
    }

    public double[] calcularQuantidadeLitrosFiltro() {
        double[] array1 = {calcularVolume() * 3, calcularVolume() * 2};
        return array1;
    }
}
